package ru.learnUp.LearnUp20_2_SpringBoot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnUp.LearnUp20_2_SpringBoot.model.User;
import ru.learnUp.LearnUp20_2_SpringBoot.services.MyService;
import ru.learnUp.LearnUp20_2_SpringBoot.services.UserService;


@SpringBootApplication
@Slf4j
public class LearnUp202SpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnUp202SpringBootApplication.class, args);
		UserService bean = context.getBean(UserService.class);
		bean.saveUser(new User(1L, "Ivan", 12));
		Integer number = context.getBean(MyService.class).getRandomNumber();
        log.info("Actually value = {}", number);

	}
}
