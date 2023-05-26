package ru.learnUp.LearnUp20_2_SpringBoot.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LogService {
	private final Logger logger;

//	@Value("DEBUG")  //это "хардкод"
	@Value("${log.level}")
	private String level;

	public LogService(Logger logger) {
		this.logger = logger;
	}

	public void logMessage(String message) {
		logger.log( "["+ level + "] " + message);
	}
}
