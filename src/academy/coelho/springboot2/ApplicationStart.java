package academy.coelho.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class ApplicationStart {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}
}
