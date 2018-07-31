package fdweb.springboot.mapper;

import fdweb.springboot.pojo.Machineinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MachineinfoMapper {

    @Select("select * from machineinfo")
    List<Machineinfo> allMachineinfo();

    @Select("select * from machineinfo where machineID=#{machineID}")
    Machineinfo getMachineinfoByID(int machineID);


}
