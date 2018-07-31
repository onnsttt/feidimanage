package fdweb.springboot.dao;

import fdweb.springboot.mapper.AgentsMapper;
import fdweb.springboot.mapper.OperatorMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class managedaoimp implements managedao {

    @Autowired
    AgentsMapper agentsMapper;

    @Autowired
    OperatorMapper operatorMapper;

    @Override
    public boolean loginByAgents(String username, String password) {
        if(agentsMapper.findAgent(username,password)!=0)
            return true;
        return false;
    }

    @Override
    public boolean loginByOperator(String username, String password) {
        if(operatorMapper.getOperator(username,password)!=0)
            return true;
        return false;
    }

}
