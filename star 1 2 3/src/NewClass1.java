
import java.util.Scanner;

class MismatchException extends Exception {
    MismatchException(String massage){
            super();
            }
}

class PassmissException extends Exception {
    PassmissException(String massage){
            super();
            }
}

class diver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your northsouth mail: ");
        String mail = sc.nextLine();
        System.out.print("Enter your password: ");
        String pass = sc.nextLine();
        try {checkmail(mail,pass);}
        catch (MismatchException e) {System.out.println("Email not matched");}
        catch (PassmissException e) {System.out.println("Password not matched");}
        
    }
    public static void checkmail(String e, String g)throws MismatchException,PassmissException{
        String a="durjoybarua01@northsouth.edu";
        String b="durjoybarua";
        if(e.compareTo(a)==0){
            if(g.compareTo(b)==0){
                
            }else{throw new PassmissException("an problem occurred");}
        }else {
            throw new MismatchException("an problem occurred");
        }
    }
}