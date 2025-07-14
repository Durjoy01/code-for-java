package angel;

import java.util.Scanner;

public class Angel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st angel");
        int a = sc.nextInt();
        System.out.println("2nd angel");
        int b = sc.nextInt();
        int sum = 180 - a - b;
        if (sum < 90) {
            System.out.println("The third angle: acute angle");
        } else if (sum == 90) {
            System.out.println("The third angle: right angle");
        } else {
            System.out.println("The third angle: obtuse angle");
        }
    }
}