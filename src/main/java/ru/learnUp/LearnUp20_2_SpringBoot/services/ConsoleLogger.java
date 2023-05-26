package ru.learnUp.LearnUp20_2_SpringBoot.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class ConsoleLogger implements Logger{

	@Override
	public void log(Object o) {
		System.out.println("LOG: " + o);
	}

}
