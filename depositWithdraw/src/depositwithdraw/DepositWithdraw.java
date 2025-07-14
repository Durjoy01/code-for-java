package depositwithdraw;

import java.util.Scanner;

public class DepositWithdraw {

    static double balance = 0;

    static void deposite(double amount) {
        balance = balance + amount;
    }

    static void withdraw(double amount) {
        balance = balance - amount;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        while (c == 0) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.print("which option=");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.print("deposite=");
                double b = sc.nextDouble();
                deposite(b);
                System.out.println("Deposite is succesful");
            } else if (a == 2) {
                System.out.print("withdraw=");
                double d = sc.nextDouble();
                if (balance < d) {
                    System.out.println("Withdraw is not possible");} 
                else {
                    withdraw(d);
                    System.out.println("withdraw is succesful");}
            } 
            else if (a == 3) {
                System.out.println("balance=" + balance);} 
            else if (a == 4) { c = 1;
                System.out.println("bye");} 
            else {
                System.out.println("Invalid input");}
        }
    }

}