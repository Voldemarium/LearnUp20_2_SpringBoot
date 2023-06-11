package ru.learnUp.LearnUp20_2_SpringBoot.demoPointcut;

public class TestDecoratedClass {
	public void randomSleep() {
		try {
			int delay = (int) (Math.random() * 50);
			System.out.println("method randomSleep, sleep time: "  +delay);
			Thread.sleep(delay * 5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void printInts(int i) {
		System.out.println("run printInts, i=" + i);
	}
}
