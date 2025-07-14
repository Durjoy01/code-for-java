package javatask2;
import  java.util.Scanner;
public class JavaTask2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Attandance=");
        double a=sc.nextInt();
        System.out.print(" out of");
        double b=sc.nextInt();
        System.out.print("Assignment=");
        double c=sc.nextInt();
        System.out.println(" out of");
        double d=sc.nextInt();
        System.out.print("Quizzes=");
        double e=sc.nextInt();
        System.out.println(" out of");
        double f=sc.nextInt();
        System.out.print("Mid=");
        double g=sc.nextInt();
        System.out.println(" out of");
        double h=sc.nextInt();
        System.out.print("Final=");
        double i=sc.nextInt();
        System.out.println(" out of");
        double j=sc.nextInt();
        
        double Attandance=(a/b)*10;
        double Assignment=(c/d)*10;
        double Quizzes   =(e/f)*15;
        double Mid       =(g/h)*30;
        double Final     =(i/j)*35;
        
        double result=Attandance + Assignment +Quizzes + Mid + Final;
        System.out.println("Result "+result+" Out of 100%");
    }
    
}