package ru.learnUp.LearnUp20_2_SpringBoot.demoPointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;

public interface Pointcut {
	ClassFilter getClassFilter();
	MethodMatcher getMethodMather();

}
