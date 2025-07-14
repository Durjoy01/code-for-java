
import java.util.Scanner;

public class Y {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[7];
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            a[i] = sc.nextInt();
        }
        boolean c = true;
        while (c) {
            for (int i = 0; i < 7; i++) {
                sum = sum + a[i];
                if (sum >= b) {
                    System.out.println(i + 1);
                    c = false;
                    break;
                }
            }
        }

    }
}
