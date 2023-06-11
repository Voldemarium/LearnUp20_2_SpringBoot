package ru.learnUp.LearnUp20_2_SpringBoot.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.learnUp.LearnUp20_2_SpringBoot.annotation.Swap;

import java.util.List;

@Service
@Slf4j
public class MyService {

	private final List<Logger> loggers;

	public MyService(List<Logger> loggers) {
		this.loggers = loggers;
	}

	@Swap
	public Integer getRandomNumber() {
		return 10;
	}

	public void doWork() {
		loggers.forEach(l -> l.log("I'm working"));
	}
}
