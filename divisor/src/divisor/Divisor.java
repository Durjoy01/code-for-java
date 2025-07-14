//Name:Durjoy barua
//Id:2131766642
//date:16/06/2022
package divisor;
import java.util.Scanner;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number=");
        int a = sc.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
    }
}
