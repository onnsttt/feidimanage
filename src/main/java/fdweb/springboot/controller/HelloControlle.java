package fdweb.springboot.controller;

import fdweb.springboot.dao.AgentsMapper;
import fdweb.springboot.dao.OperatorMapper;
import fdweb.springboot.pojo.Agents;
import fdweb.springboot.pojo.Operator;
import fdweb.springboot.server.AgentsServiceImp;
import fdweb.springboot.server.OperatorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class HelloControlle {

    @Autowired
    AgentsServiceImp agentsServiceImp;
    @Autowired
    OperatorServiceImp operatorServiceImp;
    @Autowired
    OperatorMapper operatorMapper;
    @Autowired
    AgentsMapper agentsMapper;

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request) throws UnsupportedEncodingException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Agents agents = agentsServiceImp.login(username,password);
        request.setCharacterEncoding("utf-8");
        if(agents!=null){
            ModelAndView modelAndView = new ModelAndView("agents_main");
            session.setAttribute("username",username);
            session.setAttribute("rank","1");
            session.setAttribute("random",agents.getAgentsid()+1234);
            return modelAndView;
        }
        Operator operator = operatorServiceImp.login(username,password);
        if(operator!=null){
            ModelAndView modelAndView = new ModelAndView("operator_main");
            session.setAttribute("username",operator.getNickname());
            session.setAttribute("rank","2");
            session.setAttribute("random",operator.getOperatorid()+1234);
            return modelAndView;
        }
        return new ModelAndView("index");
    }
    @RequestMapping("/test")
    @ResponseBody
    public String tt(){
        return "ttfdsafdsa";
    }


    @RequestMapping(value = "/exit")
    public ModelAndView exit(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("index");
        HttpSession session = request.getSession();
        session.removeAttribute("rank");
        session.removeAttribute("username");
        session.removeAttribute("random");
        return modelAndView;
    }
}
