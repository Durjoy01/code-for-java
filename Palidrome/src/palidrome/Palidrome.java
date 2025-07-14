package palidrome;

import java.util.Scanner;

public class Palidrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give=");
        String a = sc.nextLine();
        isPalidrome(a);
    }

    public static void isPalidrome(String arg) {
        String b = arg;
        int temp = 0;
        
        int c = b.length();
        for (int i = 0; i < (c / 2); i++) {
            if (b.charAt(i) == b.charAt(c - i - 1)) {
                temp++;
            }
        }
        if (temp == (c / 2)) {
            System.out.println(b + " is Palidrome");
        } else {
            System.out.println(b + "is not Palidrome");
        }
    }
}
