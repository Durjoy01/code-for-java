package avarageofelement;
import java.util.Scanner;
public class AvarageOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give=");
        int a[] = new int[6];
        int par,av,b=0;
        for(int i=0;i<6;i++)
        {
            a[i]=sc.nextInt();
            b=a[i]+b;
        }
        av=b/6;
        int temp=0;
        for(int i=0;i<6;i++)
        {
            if(a[i]>av){temp++;}
        }
        par=(temp*100)/6;
        System.out.println("Percentage is "+par);
    }
    
}
