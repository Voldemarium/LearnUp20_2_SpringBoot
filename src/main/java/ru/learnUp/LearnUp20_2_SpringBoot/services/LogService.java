package ru.learnUp.LearnUp20_2_SpringBoot.services;

import org.springframework.stereotype.Service;

@Service
public class LogService {
	private final Logger logger;

	public LogService(Logger logger) {
		this.logger = logger;
	}

	public void logMessage(String message) {
		logger.log(message);
	}
}
