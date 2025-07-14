import java.util.Scanner;
public class T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean h=true;
    while(h)
    {
        int a=sc.nextInt();
        int b=sc.nextInt();

        int flag=0;
        if(a==0)
            flag=1;
        for(int i=a;i<=b;i++)
        {
            int temp=i;
            while(temp>0)
            {
                int r=temp%10;
                if(r==0)
                {
                    flag++;
                    break;
                }
                temp/=10;
            }
        }
        int k=(b-a+1);
        System.out.println(flag+"/"+k);
        n--;
        if(n==0){h=false;}
    }
}}
