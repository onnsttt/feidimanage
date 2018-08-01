package fdweb.springboot;

import fdweb.springboot.util.MyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "fdweb.springboot.dao",markerInterface = MyMapper.class)
public class SpringbootApplication{

	public static void main(String[] args) {

		SpringApplication.run(SpringbootApplication.class, args);
	}
}
