package fdweb.springboot.mapper;

import fdweb.springboot.pojo.Card;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CardMapper {
    @Select("select * from card")
    List<Card> findAll();

    @Select("select * from card where number=#{number}")
    Card findCard(int number);

    @Insert("insert into card(number,money) value(#{number},#{money})")
    boolean addCardUser(int number,float money);

    @Insert("update card set money=#{money} where number=#{number}")
    boolean updateCardMoney(int number,float money);


}
