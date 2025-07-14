package alpha.digit.special;

import java.util.Scanner;

public class AlphaDigitSpecial {

    public static void main(String[] args) {
        System.out.println("give A=");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
            System.out.println("its an alphabet");
        } else if (a >= 48 && a <= 57) {
            System.out.println("its a digit");
        } else if ((a >= 0 && a <= 47)
                || (a >= 58 && a <= 64)
                || (a >= 91 && a <= 96)
                || (a >= 123 && a <= 127)) {
            System.out.println("its a special character");
        }
    }

}
