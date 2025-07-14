
import java.util.Scanner;

public class R {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//testcase
        int b[] = new int[n];
        for (int i = 0; i <n; i++) {
            int k = sc.nextInt();//number of integer
            int a[] = new int[k];
            for (int j = 0; j < k; j++) {
                a[i] = sc.nextInt();
            }
            int min = a[0];
            int min2 = 0;
            for (int j = 1; j < k; j++) {
                if (min > a[j]) {
                    min2 = min;
                    min = a[j];
                }
            }
            b[i] = min + min2;
        }
        for (int j = 0; j < n; j++) {
                System.out.println(b[j]);
            }
    }
}
