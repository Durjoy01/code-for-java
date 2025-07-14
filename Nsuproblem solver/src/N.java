
import java.util.Scanner;

public class N {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b = 0, c = 0;
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            while (a >= 1) {
                b = a % 10;
                c = c* 10 + b;
                a = a / 10;
            }
            System.out.println(c);
            c=0;
        }
    }
}
