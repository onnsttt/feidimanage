package fdweb.springboot.dao;


public interface managedao {

    public boolean loginByAgents(String username, String password);

    public boolean loginByOperator(String username,String password);

}
