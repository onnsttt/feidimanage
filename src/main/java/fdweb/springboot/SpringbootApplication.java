package fdweb.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan(basePackages = "fdweb.springboot.dao")
public class SpringbootApplication{

	public static void main(String[] args) {

		SpringApplication.run(SpringbootApplication.class, args);
        System.out.println(123);
	}
}
