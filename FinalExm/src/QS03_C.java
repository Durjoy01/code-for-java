public class QS03_C {
	public static void main(String args[]) {
		Thr1 t1 = new Thr1();
		Thr2 t2 = new Thr2();
		Thr3 t3 = new Thr3();
		t1.start();
		t2.start();
		t3.start();

	}
}

class Thr1 extends Thread {
	synchronized public void run() {
		try {
			int i = 0;
			while (i < 5) {
				sleep(1000);
				System.out.println("Good morning ");
				i++;
			}
		} catch (Exception e) {
		}
	}
}

class Thr2 extends Thread {
	synchronized public void run() {
		try {
			int i = 0;
			while (i < 5) {
				sleep(2000);
				System.out.println("hello");
				i++;
			}
		} catch (Exception e) {
		}
	}
}

class Thr3 extends Thread {
	synchronized public void run() {
		try {
			int i = 0;
			while (i < 5) {
				sleep(3000);
				System.out.println("welcome");
				i++;
			}
		} catch (Exception e) {
		}
	}
}