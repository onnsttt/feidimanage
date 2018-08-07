package fdweb.springboot.server;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import fdweb.springboot.dao.AgentsMapper;
import fdweb.springboot.dao.Consume_recordMapper;
import fdweb.springboot.dao.MachineinfoMapper;
import fdweb.springboot.dao.OperatorMapper;
import fdweb.springboot.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Service
public class Consume_RecordServiceImp implements Consume_RecordService{

    @Autowired
    Consume_recordMapper consume_recordMapper;
    @Autowired
    MachineinfoMapper machineinfoMapper;
    @Autowired
    OperatorMapper operatorMapper;
    @Autowired
    AgentsMapper agentsMapper;

    @Override
    public List<Consume_record> getAllConsume_Record(int machineid) {
//        //先获取agents的id;
//        AgentsExample agentsExample = new AgentsExample();
//        agentsExample.createCriteria().andNameEqualTo(username);
//        Agents agents = agentsMapper.selectByExample(agentsExample).get(0);
//        OperatorExample operatorExample =  new OperatorExample();
//        operatorExample.createCriteria().andAgentsidEqualTo(agents.getAgentsid());
//
//        //获取operator的id
//        List<Operator> operatorList = operatorMapper.selectByExample(operatorExample);
//        MachineinfoExample machineinfoExample = new MachineinfoExample();
//        Consume_recordExample consume_recordExample = new Consume_recordExample();
//        List<Consume_record> list = new ArrayList<>();
//        //获取各个operator的机器信息
//        for(Operator operator:operatorList){
//            machineinfoExample.createCriteria().andOperatoridEqualTo(operator.getOperatorid());
//            List<Machineinfo> machineinfoList = machineinfoMapper.selectByExample(machineinfoExample);
//
//            //获取每个机器的消费信息
//            for(Machineinfo machineinfo:machineinfoList){
        Consume_recordExample consume_recordExample = new Consume_recordExample();
        consume_recordExample.createCriteria().andMachineIdEqualTo(machineid);
        List<Consume_record> list = consume_recordMapper.selectByExample(consume_recordExample);
//                for(Consume_record consume_record:consume_recordList)
//                    list.add(consume_record);
//            }
//        }
        return list;
    }

    @Override
    public List<Consume_record> getConsume_RecordByData(String username, String data) {
        //先获取agents的id;
        AgentsExample agentsExample = new AgentsExample();
        agentsExample.createCriteria().andNameEqualTo(username);
        Agents agents = agentsMapper.selectByExample(agentsExample).get(0);
        OperatorExample operatorExample =  new OperatorExample();
        operatorExample.createCriteria().andAgentsidEqualTo(agents.getAgentsid());

        //获取operator的id
        List<Operator> operatorList = operatorMapper.selectByExample(operatorExample);
        MachineinfoExample machineinfoExample = new MachineinfoExample();
        Consume_recordExample consume_recordExample = new Consume_recordExample();
        List<Consume_record> list = new ArrayList<>();
        for(Operator operator:operatorList){
            machineinfoExample.createCriteria().andOperatoridEqualTo(operator.getOperatorid());
            List<Machineinfo> machineinfoList = machineinfoMapper.selectByExample(machineinfoExample);

            //获取每个机器的消费信息
            for(Machineinfo machineinfo:machineinfoList){
                consume_recordExample.createCriteria().andMachineIdEqualTo(machineinfo.getMachineid()).andTransactionDateLike("%"+data+"%");
                List<Consume_record> consume_recordList = consume_recordMapper.selectByExample(consume_recordExample);
                for(Consume_record consume_record:consume_recordList)
                    list.add(consume_record);
            }
        }
        return list;
    }

    @Override
    public List<Consume_record> getConsume_RecordByPhone(String username, String phone) {

        AgentsExample agentsExample = new AgentsExample();
        agentsExample.createCriteria().andNameEqualTo(username);
        Agents agents = agentsMapper.selectByExample(agentsExample).get(0);
        OperatorExample operatorExample =  new OperatorExample();
        operatorExample.createCriteria().andAgentsidEqualTo(agents.getAgentsid());

        //获取operator的id
        List<Operator> operatorList = operatorMapper.selectByExample(operatorExample);
        MachineinfoExample machineinfoExample = new MachineinfoExample();
        Consume_recordExample consume_recordExample = new Consume_recordExample();
        List<Consume_record> list = new ArrayList<>();
        for(Operator operator:operatorList){
            machineinfoExample.createCriteria().andOperatoridEqualTo(operator.getOperatorid());
            List<Machineinfo> machineinfoList = machineinfoMapper.selectByExample(machineinfoExample);

            //获取每个机器的消费信息
            for(Machineinfo machineinfo:machineinfoList){
                consume_recordExample.createCriteria().andMachineIdEqualTo(machineinfo.getMachineid()).andUserPhoneEqualTo(phone);
                List<Consume_record> consume_recordList = consume_recordMapper.selectByExample(consume_recordExample);
                for(Consume_record consume_record:consume_recordList)
                    list.add(consume_record);
            }
        }
        return list;
    }

    @Override
    public float getMonthData(int machineid ,String data) {
        Consume_recordExample consume_recordExample = new Consume_recordExample();
//        System.out.println(data);
        consume_recordExample.createCriteria().andMachineIdEqualTo(machineid).andTransactionDateLike("%"+data+"%");
        List<Consume_record> list = consume_recordMapper.selectByExample(consume_recordExample);
        float ans = 0;
        for(Consume_record consume_record:list)
            ans += consume_record.getConsumeMoney();
        return ans;
    }
}
