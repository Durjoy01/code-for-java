import java.util.Scanner;
public class NewClass {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n= ");
        int a = sc.nextInt();
        for (int i = 6; i <=a; i++) {
            int x = method(a);
            if (x == 1) {
                System.out.println(i);
            }
        }

    }

    public static int method(int a) {
        int sum = 0;
        for (int i = 2; i < a; i++)
        {
            if (a % i == 0) 
            {
                sum = sum + i;
            }
        }
        if (sum == a) {
            return 1;
        } else {
            return 0;
        }
    }
}
