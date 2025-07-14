import java.util.Scanner;
public class F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
         double circel[]=new  double[t];
          double rectarea[]=new  double[t];
        for(int i=0;i<t;i++)
        {
            double radius=a[i]/5;
                   circel[i]=radius*radius*3.1416;
            double width=(a[i]*6)/10;
            double rect=a[i]*width;
                   rectarea[i]=rect-circel[i];
        }
        for(int i=0;i<t;i++)
        {
            System.out.printf("%.2f %.2f"+"\n",circel[i],rectarea[i]);
            
        }
    }
}
