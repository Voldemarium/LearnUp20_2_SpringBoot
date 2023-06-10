package ru.learnUp.LearnUp20_2_SpringBoot.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Aspect
@Slf4j
public class MyLogAspect {
	@After("execution(* ru.learnUp.LearnUp20_2_SpringBoot.dao.*.*(..))")
	public void log(JoinPoint point) {
		String methodName = point.getSignature().getName();
		List<String> args = Arrays.stream(point.getArgs())
				.map(Object::toString)
				.collect(Collectors.toList());
		log.info("Invoked method: {}, with params {}", methodName, args);
	}
}
