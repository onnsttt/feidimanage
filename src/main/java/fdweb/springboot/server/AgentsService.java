package fdweb.springboot.server;

import fdweb.springboot.pojo.Agents;

public interface AgentsService extends ISservice<Agents> {

    public boolean login(String username,String password);

    public boolean updatePassword(String oldpassword,String newpassword);

    public boolean updatePhone(String name,String phone);

}
