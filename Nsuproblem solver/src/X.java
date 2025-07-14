
import java.util.Scanner;

public class X {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c[] = new int[b];
        int sum = 0;
        int min = 0;
        int max = 0;
        int h=a/b;
        int k=a%b;
        int j=a-b+1;
        min=(a*(a-1)/2)*(b-k)+(a*(a+1)/2)*k;
        max=((a - b + 1)*((a - b + 1)-1))/2;
        System.out.println(min+" "+max);
        
    }
}
