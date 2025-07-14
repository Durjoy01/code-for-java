package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int b[]=new int[a];
        for (int i = 0; i <a; i++) {
            b[i]=n1;
            System.out.print(b[i]+" ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}