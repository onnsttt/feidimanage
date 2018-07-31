package fdweb.springboot.mapper;

import fdweb.springboot.pojo.Operator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OperatorMapper {

    @Select("select * from operator")
    List<Operator> allOperator();

    @Select("select count(*) from operator where name=#{name} and password=#{password}")
    int getOperator(String user,String password);
}
