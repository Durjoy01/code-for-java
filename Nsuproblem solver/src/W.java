
import java.util.Scanner;

public class W {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, temp = 0;
        int a = sc.nextInt();
        int b[][] = new int[a][3];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a; j++) {
                sum = sum + b[j][i];
            }
            if (sum != 0) {
                temp = 0;
                break;
            } else {
                temp = 1;
            }
        }
        if (temp == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
