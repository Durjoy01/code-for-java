package exceptionexc;
public class emailException extends Exception {
    emailException(String massage){
            super();
            System.out.println(massage);}
}

class PassmismatchException extends Exception {
    PassmismatchException(String massage){
            super();
            System.out.println(massage);}
}

class cseException extends Exception{
     cseException(){super();}
}

class matException extends Exception{
     matException(){super();}
}

class gedException extends Exception{
     gedException(){super();}
}
class creditException extends Exception{
     creditException(){super();}
}