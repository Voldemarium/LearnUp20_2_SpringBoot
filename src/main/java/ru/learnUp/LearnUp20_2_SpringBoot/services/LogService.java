package ru.learnUp.LearnUp20_2_SpringBoot.services;

import org.springframework.stereotype.Service;

@Service
public class LogService {
	private final Logger logger;  //таких логгеров у нас 2(ConsoleLogger и FileLogger), будет ошибка выбора

	public LogService(Logger logger) {
		this.logger = logger;
	}

	public void logMessage(String message) {
		logger.log(message);
	}
}
