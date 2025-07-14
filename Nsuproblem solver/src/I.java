import java.util.Scanner;
public class I {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            int a[]=new int[t];
            int sum=0;
            for(int i=0;i<t;i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            System.out.println(sum);
}
}
