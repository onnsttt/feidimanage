package fdweb.springboot.server;

import fdweb.springboot.pojo.Machineinfo;

import java.util.List;

public interface MachineService {

    public List<Machineinfo> getAllmachine(int operator);

    public boolean getMachineState(int machineid);

    public void changeMachineState(int machineid);
}
