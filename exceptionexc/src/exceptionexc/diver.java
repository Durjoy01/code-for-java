package exceptionexc;
import java.util.Scanner;
public class diver extends courseSolt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your northsouth mail: ");
        String mail = sc.nextLine();
        System.out.print("Enter your password: ");
        String pass = sc.nextLine();
        try {checkmail(mail,pass);}
        catch (emailException e) {System.out.println("Email not matched");}
        catch (PassmismatchException e) {System.out.println("Password not matched");} 
    }
public static void checkmail(String e, String g)throws emailException,PassmismatchException{
        String a="durjoybarua01@northsouth.edu";
        String b="durjoybarua";
        if(e.compareTo(a)==0){
            if(g.compareTo(b)==0){
                int n=12;
               course();
            }else{throw new PassmismatchException("an problem occurred");}
        }else {
            throw new emailException("an problem occurred");
        }
    }
}