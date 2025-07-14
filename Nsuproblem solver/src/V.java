
import java.util.Scanner;

public class V {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0,j=0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c[] = new int[32];
        int d[]=new int[32];
        while (a != 0) {
            c[i] = a % 2;
            a = a / 2;
            i++;
        }
        
        while (b != 0) {
            d[j] = b % 2;
            b = b / 2;
            j++;
        }
    }
}
