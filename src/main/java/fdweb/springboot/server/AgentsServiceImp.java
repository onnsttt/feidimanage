package fdweb.springboot.server;

import fdweb.springboot.dao.AgentsMapper;
import fdweb.springboot.pojo.Agents;
import fdweb.springboot.pojo.AgentsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AgentsServiceImp extends BaseService<Agents> implements AgentsService {

    @Autowired
    private AgentsMapper agentsMapper;

    @Override
    public boolean login(String username, String password) {
        AgentsExample example = new AgentsExample();
        example.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
        List<Agents> list=agentsMapper.selectByExample(example);
        System.out.println(list.size());
        if(list==null||list.size()==0)
            return  false;
        return true;
    }

    @Override
    public boolean updatePassword(String oldpassword, String newpassword) {
        return false;
    }

    @Override
    public boolean updatePhone(String name,String phone) {
        AgentsExample example = new AgentsExample();
        example.createCriteria().andNameEqualTo("root");
        Agents agents = agentsMapper.selectByExample(example).get(0);
        agents.setPhone(phone);
        agentsMapper.updateByPrimaryKey(agents);
        return true;
    }
}
