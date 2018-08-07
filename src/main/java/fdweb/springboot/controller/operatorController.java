package fdweb.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import fdweb.springboot.pojo.Consume_record;
import fdweb.springboot.pojo.Machineinfo;
import fdweb.springboot.pojo.Meal;
import fdweb.springboot.server.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Controller
@RequestMapping(value = "/operator")
public class operatorController {

    @Autowired
    Consume_RecordServiceImp consumeRecordServiceImp;
    @Autowired
    MealServiceImp mealServiceImp;
    @Autowired
    OperatorServiceImp operatorServiceImp;
    @Autowired
    MachineServiceImp machineServiceImp;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


//    @RequestMapping(value = "/tables")
//    public ModelAndView tables(HttpServletRequest request){
//
//    }

    @RequestMapping(value = "/main")
    public ModelAndView main(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("operator_main");
        return modelAndView;
    }

    @RequestMapping(value = "/consume")
    public ModelAndView consume(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("opetarot_consume");
        List<Consume_record> list = new ArrayList<>();
        List<Machineinfo> machineinfoList = machineServiceImp.getAllmachine(Integer.parseInt(request.getSession().getAttribute("random").toString())-1234);
        for(Machineinfo machineinfo:machineinfoList){
            List<Consume_record> recordList = consumeRecordServiceImp.getAllConsume_Record(machineinfo.getMachineid());
            for(Consume_record consume_record:recordList)
                list.add(consume_record);
        }
        String jslist = JSON.toJSONString(list);
        modelAndView.addObject("consume_list",jslist);
        return modelAndView;
    }

    @RequestMapping(value = "/tables")
    public ModelAndView tables(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("operator_tables");
        List<Machineinfo> list = machineServiceImp.getAllmachine(Integer.parseInt(request.getSession().getAttribute("random").toString())-1234);
        modelAndView.addObject("machineinfolist",JSON.toJSONString(list));
        return modelAndView;
    }

    @RequestMapping(value = "/machinestatechange")
    @ResponseBody
    public ModelAndView machinestatechange(HttpServletRequest request,String machineid){
        machineServiceImp.changeMachineState(Integer.parseInt(machineid.toString()));
        ModelAndView modelAndView = new ModelAndView("operator_tables");
        List<Machineinfo> list = machineServiceImp.getAllmachine(Integer.parseInt(request.getSession().getAttribute("random").toString())-1234);
        modelAndView.addObject("machineinfolist",JSON.toJSONString(list));
        return modelAndView;
    }

    @RequestMapping(value = "/meal")
    public ModelAndView meal(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("operator_meal");
        modelAndView.addObject("meal",JSON.toJSONString(mealServiceImp.getMeal(Integer.parseInt(request.getSession().getAttribute("random").toString())-1234)));
        return modelAndView;
    }

    @RequestMapping(value = "/mealupdate")
    @ResponseBody
    public String mealupdate(HttpServletRequest request,String operatorid,String name,String money,String time){
        logger.info("修改套餐信息:"+operatorid+"name: "+name+"  money:"+money+"  time:"+time);
        Meal meal  = new Meal();
        meal.setMoney(Float.parseFloat(money));
        meal.setName(name);
        meal.setOperatorid(Integer.parseInt(operatorid)-1234);
        meal.setTime(Integer.parseInt(time));
        mealServiceImp.updateMeal(meal);
        return "yes";
    }
    @RequestMapping(value = "/getinmoney")
    @ResponseBody
    public String getinmoney(HttpServletRequest request){
        String operatorid = request.getSession().getAttribute("random").toString();
        String nowdata = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        logger.info(nowdata+" 用户登录:"+operatorid);
        int now = Integer.parseInt(nowdata.substring(nowdata.length()-2));
        nowdata = nowdata.substring(0,nowdata.length()-2);
        List<Machineinfo> machineinfoList = machineServiceImp.getAllmachine(Integer.parseInt(operatorid)-1234);
        List<String> list = new ArrayList<>();
        for(int i = 1;i<=now;i++){
            float ans = 0f;
            if(i<10)
                for(Machineinfo machineinfo:machineinfoList)
                    ans+=consumeRecordServiceImp.getMonthData(machineinfo.getMachineid(),nowdata+"0"+i);
            else
                for(Machineinfo machineinfo:machineinfoList)
                    ans+=consumeRecordServiceImp.getMonthData(machineinfo.getMachineid(),nowdata+i);
            list.add(Float.toString(ans));
        }
        return list.toString().substring(1,list.toString().length()-1);
    }

    @ResponseBody
    @RequestMapping(value = "/getAllMoneyByMonth")
    public String getAllMoneyByMonth(HttpServletRequest request){
        String operatorid = request.getSession().getAttribute("random").toString();
        String nowdate = new SimpleDateFormat("yyyy-MM").format(new Date());
        logger.info(operatorid+" 查询当月的总收入：" +new Date());
        List<Machineinfo> machineinfoList = machineServiceImp.getAllmachine(Integer.parseInt(operatorid)-1234);
        float ans = 0;
        for(Machineinfo machineinfo:machineinfoList){
            ans+=consumeRecordServiceImp.getMonthData(machineinfo.getMachineid(),nowdate);
        }
        return Float.toString(ans);
    }


}
