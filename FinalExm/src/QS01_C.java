import java.util.Scanner;

class InputThread {
	int x, y;
	String s1, s2;

	public void take() throws InterruptedException {
		Scanner input = new Scanner(System.in);

		synchronized (this) {
			System.out.println("Enter integer 1: ");
			s1 = input.next();
			x = Integer.parseInt(s1);
			System.out.println("Enter integer 2: ");
			s2 = input.next();
			y = Integer.parseInt(s2);
			notify();
		}
		input.close();
	}

	public void sum() throws InterruptedException {
		synchronized (this) {
			wait();
			System.out.println("The sum is : " + (x + y));
		}

	}

}

public class QS01_C {

	public static void main(String[] args) throws InterruptedException {
		InputThread thrd = new InputThread();

		Thread thrd1 = new Thread(new Runnable() {
			public void run() {
				try {
					thrd.take();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thrd2 = new Thread(new Runnable() {
			public void run() {
				try {
					thrd.sum();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		thrd1.start();
		thrd2.start();
		thrd1.join();
		thrd2.join();
	}

}