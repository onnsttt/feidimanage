package fdweb.springboot.server;

import fdweb.springboot.dao.MachineinfoMapper;
import fdweb.springboot.pojo.Machineinfo;
import fdweb.springboot.pojo.MachineinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineServiceImp implements MachineService{

    @Autowired
    MachineinfoMapper machineinfoMapper;


    @Override
    public List<Machineinfo> getAllmachine(int operator) {
        MachineinfoExample machineinfoExample = new MachineinfoExample();
        machineinfoExample.createCriteria().andOperatoridEqualTo(operator);
        return machineinfoMapper.selectByExample(machineinfoExample);
    }

    @Override
    public boolean getMachineState(int machineid) {
        return machineinfoMapper.selectByPrimaryKey(machineid).getState().equals("1");
    }

    @Override
    public void changeMachineState(int machineid) {
        Machineinfo machineinfo = machineinfoMapper.selectByPrimaryKey(machineid);
        if(machineinfo.getState().equals("1"))
            machineinfo.setState("0");
        else
            machineinfo.setState("1");
        machineinfoMapper.updateByPrimaryKey(machineinfo);
    }
}
