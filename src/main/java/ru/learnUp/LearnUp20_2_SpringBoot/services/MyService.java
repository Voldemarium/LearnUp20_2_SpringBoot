package ru.learnUp.LearnUp20_2_SpringBoot.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MyService {

	private final List<Logger> loggers;

	public MyService(List<Logger> loggers) {
		this.loggers = loggers;
	}


	public void doWork() {
		loggers.forEach(l -> l.log("I'm working"));
	}
}
