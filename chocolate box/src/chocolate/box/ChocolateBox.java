package chocolate.box;

import java.util.Scanner;

public class ChocolateBox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= a; i++) {
            temp++;
            if (temp == 4) {
                a++;
                temp = 0;
            }
        }
        System.out.println(a-1);
    }
}
