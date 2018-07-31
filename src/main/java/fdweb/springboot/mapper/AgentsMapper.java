package fdweb.springboot.mapper;

import fdweb.springboot.pojo.Agents;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface AgentsMapper {

    @Select("select * from agents")
    List<Agents> findAll();

    @Select("select count(*) from agents where name=${username} and password={password}")
    int findAgent(String user,String password);

}
