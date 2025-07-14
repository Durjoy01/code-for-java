package aaa.bbb.ccc;

import java.util.Scanner;

public class AAABbbCcc {

    public static void main(String[] args) {
        int i, j;
        char ch = 'A';
        System.out.println("enter rows number n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(ch);
            }
            System.out.print("\n");
            ch++;
        }
    }

}