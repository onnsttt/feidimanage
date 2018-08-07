package fdweb.springboot.server;

import fdweb.springboot.dao.OperatorMapper;
import fdweb.springboot.pojo.Operator;
import fdweb.springboot.pojo.OperatorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperatorServiceImp implements OperatorService{

    @Autowired
    OperatorMapper operatorMapper;

    @Override
    public List<Operator> getAllOperator(int agentsid) {
        OperatorExample operatorExample = new OperatorExample();
        operatorExample.createCriteria().andAgentsidEqualTo(agentsid);
        List<Operator> list = operatorMapper.selectByExample(operatorExample);
        return list;
    }

    @Override
    public boolean updateInfo(String username, Operator operator) {
        OperatorExample operatorExample = new OperatorExample();
        operatorExample.createCriteria().andNameEqualTo(username);
        Operator operator1 = operatorMapper.selectByExample(operatorExample).get(0);
        operator.setOperatorid(operator1.getOperatorid());
        operatorMapper.updateByPrimaryKey(operator);
        return true;
    }

    @Override
    public boolean insetOperator(Operator operator) {
        OperatorExample operatorExample = new OperatorExample();
        operatorExample.createCriteria().andNameEqualTo(operator.getName());
        if(operatorMapper.selectByExample(operatorExample).get(0)==null)
            return false;
        operatorMapper.insert(operator);
        return true;
    }

    @Override
    public Operator login(String username, String password) {
        OperatorExample operatorExample = new OperatorExample();
        operatorExample.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
        return operatorMapper.selectByExample(operatorExample).get(0);
    }

}
