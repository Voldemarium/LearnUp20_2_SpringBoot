package ru.learnUp.LearnUp20_2_SpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.learnUp.LearnUp20_2_SpringBoot.services.Logger;
import ru.learnUp.LearnUp20_2_SpringBoot.services.MyService;

@Configuration
public class AppConfig {

	@Bean
	public Logger logger() { // name = <bean id="logger"/>
		return new Logger();
	}

	@Bean
	public MyService myService(Logger logger) { // name = <bean id="myService"/>
		return new MyService(logger);
	}
}
