package ru.learnUp.LearnUp20_2_SpringBoot.demoProxyFactory;

import org.springframework.aop.framework.ProxyFactory;

public class ProxyFactorTest {
	public static void main(String[] args) {
		CounterTime target = new CounterTime();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);               //установка обьекта - цели
		proxyFactory.addAdvice(new PrintTimeSleep()); // добавление обьекта с советом

		CounterTime proxy = (CounterTime) proxyFactory.getProxy();
		proxy.longLoop();                             // вызов метода из обьекта-цели
	}

}
