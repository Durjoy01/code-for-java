package oddprime;

import java.util.Scanner;

public class OddPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M=");
        int a = sc.nextInt();
        System.out.print("N=");
        int b = sc.nextInt();
        int temp = 0;
        for (int i =a; i <=b; i++) 
        {
            if (i % 2 != 0) 
            {
                for (int j = 2; j < i; j++) 
                {
                    if (i % j == 0)
                    {
                        System.out.println(i);
                        break;
                    }
                        
                }
            }
        }
    }
}
