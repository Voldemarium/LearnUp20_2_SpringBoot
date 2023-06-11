package ru.learnUp.LearnUp20_2_SpringBoot.demoPointcut;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Start " + invocation.getMethod().getName());
		Object obj = invocation.proceed();
		System.out.println("End " + invocation.getMethod().getName());
		return obj;
	}
}
