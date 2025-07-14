public class QS4_C {

	public static class Thread1 extends Thread {
		private int count;

		public Thread1(int count) {
			this.count = count;
		}

		@Override
		public void run() {
			if (count < 50) {
				createThread(count + 1);
			}
			System.out.println("Hello from Thread " + count + "!");
		}

		public void createThread(int count) {

			Thread1 thread = new Thread1(count);
			thread.start();

			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread1 thread = new Thread1(1);
		thread.start();

	}

}