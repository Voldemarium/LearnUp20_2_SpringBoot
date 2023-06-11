package ru.learnUp.LearnUp20_2_SpringBoot.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import ru.learnUp.LearnUp20_2_SpringBoot.services.FileLogger;

import java.time.Instant;

@Component
@Aspect
@Slf4j
public class ChangeAspect {

	@Around("@annotation(ru.learnUp.LearnUp20_2_SpringBoot.annotation.Swap)")
	public Object swap(ProceedingJoinPoint point) throws Throwable {
		Object returnedValue = point.proceed();
		log.info("Returned class: {}, value = {}", returnedValue.getClass(), returnedValue);
		return 25;
	}
}
