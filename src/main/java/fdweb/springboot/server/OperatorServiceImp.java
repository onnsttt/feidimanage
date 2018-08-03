package fdweb.springboot.server;

import fdweb.springboot.dao.OperatorMapper;
import fdweb.springboot.pojo.Operator;
import fdweb.springboot.pojo.OperatorExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
}
