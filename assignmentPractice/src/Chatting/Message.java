package Chatting;

public class Message extends Thread {
	String[] output = { "Hi", "How are you?", "I'm fine, thank you.", "What are you doing?", "I'm watching TV.",
			"Have you done your HW?", "yup", "What is yout favourite color?", "BLACK", "BLUE", "What about you?" };

	public synchronized void threadMessage() throws InterruptedException {
		for (int i = 0; i < output.length; i++) {
			// System.out.println();
			if (!(Thread.currentThread().getName().equals("main"))) {
				System.out.print(Thread.currentThread().getName() + ": " + output[i] + "\n\n");
				notify();
				wait(1000);
			}

		}
	}

	public void run() {
		try {
			threadMessage();
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		Message m1 = new Message(); // person 1
		Message m2 = new Message(); // person 2
		Message m3 = new Message(); // person 3
		m1.setName("USER 1");
		m2.setName("USER 2");
		m3.setName("USER 3");
		m1.setPriority(MAX_PRIORITY);
		m2.setPriority(MAX_PRIORITY);
		m3.setPriority(MAX_PRIORITY);
		m1.start();
		m2.start();
		m3.start();
		m1.run();
		m2.run();
		m3.run();

	}
}