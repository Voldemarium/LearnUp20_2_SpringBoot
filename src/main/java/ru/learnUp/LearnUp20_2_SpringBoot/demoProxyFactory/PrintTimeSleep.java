package ru.learnUp.LearnUp20_2_SpringBoot.demoProxyFactory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Date;

public class PrintTimeSleep implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("Time before method boot: " + new Date());
		Object value = method.proceed();
		System.out.println("Time after method boot: " + new Date());
		return value;
	}
}
