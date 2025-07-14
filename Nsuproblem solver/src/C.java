
import java.util.Arrays;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int temp = 0;
            int a[] = new int[3];
            int p[] = new int[3];
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < 3; j++) {
                    a[j] = sc.nextInt();
                    if (a[j] >= 1 && a[j] <= 1000000) {
                        temp = 1;
                    } else {
                        break;
                    }
                }
                if (temp == 1) {
                    Arrays.sort(a);
                    p[i] = a[1];
                }
                else{break;}
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(p[i]);
            }
    }
}
