
import java.util.Scanner;

public class U {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0;i<a;i++)
      {
           int c = sc.nextInt();
            if(c%b==0)
           {

               temp++;
           }
      }
        System.out.println(temp);
    }
}
