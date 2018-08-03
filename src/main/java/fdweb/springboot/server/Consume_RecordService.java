package fdweb.springboot.server;

import fdweb.springboot.pojo.Consume_record;

import java.util.List;

public interface Consume_RecordService {
    public List<Consume_record> getAllConsume_Record(String username);

    public List<Consume_record> getConsume_RecordByData(String username,String data);

    public List<Consume_record> getConsume_RecordByPhone(String username,String phone);

}
