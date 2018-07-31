package fdweb.springboot;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import fdweb.springboot.mapper.AgentsMapper;
import fdweb.springboot.mapper.CardMapper;
import fdweb.springboot.mapper.Consume_recordMapper;
import fdweb.springboot.pojo.Card;
import fdweb.springboot.pojo.Consume_record;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.SocketTimeoutException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    private Consume_recordMapper consume_recordMapper;

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
	    List<Consume_record> list= consume_recordMapper.getMachineConsume_record(10001);
	    for(Consume_record consume_record:list)
            System.out.println(consume_record.toString());
    }

}
