package fdweb.springboot.server;

import fdweb.springboot.dao.AgentsMapper;
import fdweb.springboot.dao.Consume_recordMapper;
import fdweb.springboot.dao.MachineinfoMapper;
import fdweb.springboot.dao.OperatorMapper;
import fdweb.springboot.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public List<Consume_record> getAllConsume_Record(String username) {
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
        //获取各个operator的机器信息
        for(Operator operator:operatorList){
            machineinfoExample.createCriteria().andOperatoridEqualTo(operator.getOperatorid());
            List<Machineinfo> machineinfoList = machineinfoMapper.selectByExample(machineinfoExample);

            //获取每个机器的消费信息
            for(Machineinfo machineinfo:machineinfoList){
                consume_recordExample.createCriteria().andMachineIdEqualTo(machineinfo.getMachineid());
                List<Consume_record> consume_recordList = consume_recordMapper.selectByExample(consume_recordExample);
                for(Consume_record consume_record:consume_recordList)
                    list.add(consume_record);
            }
        }
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
}
