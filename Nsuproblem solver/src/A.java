import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b, c1 = 0, c2 = 0;
        int even = 0, odd = 0;
        for (int i =1; i<=a; i++) {
            b = sc.nextInt();
            if (b % 2 == 0) {
                c1 = i;
                even++;
            } else {
                c2 = i;
                odd++;
            }
        }
        if (even > odd) {
            System.out.println(c2);
        } else {
            System.out.println(c1);
        }
    }
}
