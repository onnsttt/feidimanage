package fdweb.springboot;

import fdweb.springboot.pojo.Consume_record;
import fdweb.springboot.server.AgentsServiceImp;
import fdweb.springboot.server.Consume_RecordServiceImp;
import fdweb.springboot.util.MyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
@WebAppConfiguration
public class SpringbootApplicationTests {

    @Autowired
    AgentsServiceImp  agentsServiceImp;

    @Autowired
    Consume_RecordServiceImp consume_recordServiceImp;

    @Autowired

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void testcard(){
//		List<Card> list = cardMapper.findAll();
//		for(Card card:list)
//            System.out.println(card.toString());
//	}

	@Test
    public void testconsume(){
        List<Consume_record> list = consume_recordServiceImp.getConsume_RecordByPhone("root","15084733921");
	    for (Consume_record consume_record:list)
            System.out.println(consume_record.toString());
	}
	@Test
    public void testurl(){

    }
}
