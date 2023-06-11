package ru.learnUp.LearnUp20_2_SpringBoot.demoProxyFactory;

public class CounterTime {
	public void longLoop() {
		try {
			int delay = (int) (Math.random() * 10);
			System.out.println("sleep time : " + delay);
			Thread.sleep(delay * 5000L);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
