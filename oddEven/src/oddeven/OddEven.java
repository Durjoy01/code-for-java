//Name:Durjoy barua
//Id:2131766642
//date:16/06/2022
package oddeven;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number=");
        int a = sc.nextInt();
        switch (a % 2){
            case 0 : System.out.println("Even");
            break;
            case 1 : System.out.println("Odd");
        }
    }
}