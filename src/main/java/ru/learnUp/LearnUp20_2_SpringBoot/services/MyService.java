package ru.learnUp.LearnUp20_2_SpringBoot.services;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyService {

	private final Logger logger;

	public MyService(Logger logger) {
		this.logger = logger;
	}

	public void doWork() {
		log.info("I'm working");
	}
}
