
import java.util.Scanner;

public class NewClass1 {
    
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int a = sc.nextInt();
        int x = sum(a);
        System.out.println("Sum= " + x);
    }

    public static int sum(int a) {
        int x = 0;
        int b = 0;
        while (a != 0) {
            b = a % 10;
            x = x + b;
            a = a / 10;
        }

        return x;
    }

}
