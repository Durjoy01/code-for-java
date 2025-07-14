package newpackage;

import java.util.Scanner;

public class prb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            try {
                a[i] = sc.nextInt();
                if (a[i] < 0) {
                    i--;
                    throw new negaException();
                }
            } catch (Exception e) {
                System.out.println("Input positive integer only");
            }
        }
    }
}

class negaException extends Exception {

    negaException() {
        super();
    }
}
