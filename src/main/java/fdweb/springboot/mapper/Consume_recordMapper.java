package fdweb.springboot.mapper;

import fdweb.springboot.pojo.Consume_record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface Consume_recordMapper {
    @Select("select * from consume_record")
    List<Consume_record> allConsume_record();

    @Select("select * from consume_record where transaction_date like #{date}")
    List<Consume_record> getDateConsume_record(String date);

    @Select("select * from consume_record where user_phone=#{phone}")
    List<Consume_record> getUserConsume_record(String phone);

    @Select("select * from consume_record where machine_id=#{machineid}")
    List<Consume_record> getMachineConsume_record(int machineid);

    @Select("SELECT sum(consume_money) FROM consume_record WHERE machine_id=#{machine_id}")
    float getallMoney(int machine_id);






}
