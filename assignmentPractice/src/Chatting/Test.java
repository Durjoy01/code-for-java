package Chatting;

import java.util.Scanner;

class Chat {

	boolean flag = false;
	public synchronized void p1(String msg) {
		if (flag) {
			try {
				Thread.sleep(3000);
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(msg);
		flag = true;
		notify();
	}

	public synchronized void p2(String msg) {
		if (!flag) {
			try {
				wait();
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(msg);
		flag = false;
		notify();
	}

	public synchronized void p3(String msg) {
		if (flag) {
			try {
				
				Thread.sleep(3000);
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(msg);
		flag = false;
		notify();
	}
}

class person1 implements Runnable {

	Chat m;
	String s[] = { "Hi", "How are you?" , "yeah"};
	Scanner in = new Scanner(System.in);

	public person1(Chat m) {
		this.m = m;
		new Thread(this, "p1").start();
	}

	public void run() {
		for (int i = 0; i < s.length; i++) {

			m.p1(s[i]);
		}
	}
}

class person2 implements Runnable {

	Chat m;
	String s[] = { "Hello", "Fine" , "not bad"};
	Scanner in = new Scanner(System.in);

	public person2(Chat m) {
		this.m = m;
		new Thread(this, "p2").start();
	}

	public void run() {
		for (int i = 0; i < s.length; i++) {

			m.p2(s[i]);
		}
	}
}

class person3 implements Runnable {
	
	Chat m;
	String s[] = { "Hey", "How you doing?" ,"Have you guys done with your assignments?"};
	Scanner in = new Scanner(System.in);

	public person3(Chat m) {
		this.m = m;
		new Thread(this, "p3").start();
	}

	public void run() {
		for (int i = 0; i < s.length; i++) {

			m.p3(s[i]);
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Chat m = new Chat();
		new person1(m);
		new person2(m);
		new person3(m);
	}
}