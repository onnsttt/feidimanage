package fdweb.springboot.server;

import fdweb.springboot.pojo.Operator;

import java.util.List;

public interface OperatorService {
    public List<Operator> getAllOperator(int agentsid);

    public boolean updateInfo(String username,Operator operator);

    public boolean insetOperator(Operator operator);

    public Operator login(String username, String password);

}
