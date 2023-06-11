package ru.learnUp.LearnUp20_2_SpringBoot.demoPointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class DynamicMethodMatherPointcut extends DynamicMethodMatcherPointcut {
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return false;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		if (args.length == 0) {
			return false;
		}

		Object obj = args[0];
		if (obj instanceof Integer) {
			return (Integer) obj > 500;
		} else
			return false;
	}

	public ClassFilter classFilter() {
		return new ClassFilter() {
			@Override
			public boolean matches(Class<?> clazz) {
				return clazz == TestDecoratedClass.class;
			}
		};
	}
}
