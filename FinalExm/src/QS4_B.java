class Test {

	synchronized void test1(Test s2) throws InterruptedException {
		System.out.println("test1-begin");
		Thread.sleep(1000);

		s2.test2();
		System.out.println("test1-end");
	}


	synchronized void test2() throws InterruptedException {
		System.out.println("test2-begin");
		Thread.sleep(1000);
		System.out.println("test2-end");
	}
}

class Thread1 extends Thread {
	private Test s1;
	private Test s2;

	public Thread1(Test s1, Test s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		try {
			s1.test1(s2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Thread2 extends Thread {
	private Test s1;
	private Test s2;

	public Thread2(Test s1, Test s2) {
		this.s1 = s1;
		this.s2 = s2;
	}


	@Override
	public void run() {
		
		try {
			s2.test1(s1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class QS4_B {
	public static void main(String[] args) throws InterruptedException {
		
		Test s1 = new Test();
		Test s2 = new Test();

		Thread1 t1 = new Thread1(s1, s2);
		t1.start();

		Thread2 t2 = new Thread2(s1, s2);
		t2.start();

		Thread.sleep(100);
	}
}