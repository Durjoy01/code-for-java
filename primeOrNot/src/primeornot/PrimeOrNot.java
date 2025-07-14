//Name:Durjoy barua
//Id:2131766642
//date:16/06/2022
package primeornot;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Give the number=");
        int a = sc.nextInt();
        int temp=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
              temp++;
              break;
            }
        }
        if (temp==1)
        {
            System.out.println("This number is not prime");
        }
        else{
            System.out.println("This number is prime");
        }
    }
    
}
