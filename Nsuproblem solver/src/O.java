import java.util.Scanner;
public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a,c = 1;
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            for (int k = 1; k <= a;k++) {c = c * k;}
            System.out.println(c);
            c = 1;
        }
    }
}
