import java.util.Scanner;
public class D {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int  n=sc.nextInt();//frnd
       int  k=sc.nextInt();//bottle
       int  l=sc.nextInt();//milliliters
       int  c=sc.nextInt();//lime
       int  d=sc.nextInt();//lime slice
       int  p=sc.nextInt();//salt
       int  nl=sc.nextInt();//eash frnd got milliliter
       int  np=sc.nextInt();//each got salt
       // bottle
       int drinkhobe=k*l/nl;
       int limeache=c*d;
       int saltache=p/np;
       int min=drinkhobe;
       if(saltache<min && saltache<limeache)
       {min=saltache;}
       else if(limeache<min&& limeache<saltache)
       {min=limeache;}
       
       int round=min/n;
        System.out.println(round);
    }
}