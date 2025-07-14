
import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char d[]=new char[a];
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int c=sc.nextInt();
                if(b>c){d[i]='>';}
                else if(c>b){d[i]='<';}
                else if(c==b){d[i]='=';}
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(d[i]);
        }
    }
}
