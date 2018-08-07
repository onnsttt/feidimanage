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
    public Agents login(String username, String password) {
        AgentsExample example = new AgentsExample();
        example.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
        return agentsMapper.selectByExample(example).size()==0?null:agentsMapper.selectByExample(example).get(0);
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
