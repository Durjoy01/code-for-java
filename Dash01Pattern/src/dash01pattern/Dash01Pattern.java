package dash01pattern;

import java.util.Scanner;

public class Dash01Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {

            if (i > 0) {
                for(int k=1;k<=i;k++)
                {System.out.print("_");}
                
                for (int j =i+1; j <= 9 - i; j++) {
                    if (j % 2 == 0) {
                        System.out.print("1");
                    } else {
                        {
                            System.out.print("0");
                        }

                    }
                }
            } 
            else {
                for (int j = 1; j <= 9 - i; j++) {
                    if (j % 2 == 0) 
                    {
                        System.out.print("1");
                    } 
                    else 
                    {

                        System.out.print("0");
                    }
                }
            }

            System.out.println();
        }
    }
}