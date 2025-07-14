package assignment6;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [6];
        int sum=0;
        for(int i=0;i<6;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        double avg=sum/6;
        int temp=0;
         for(int i=0;i<6;i++)
        {
            if(a[i]>6)
            {
                temp++;
            }
        }
         double x=(temp*100)/6;
         System.out.println("parcentage= "+x);
    }
    
}
