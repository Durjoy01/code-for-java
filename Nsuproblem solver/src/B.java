import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = null;
        String b[]=new String[100];
        int j=0;
        for(int i=1; i<100; i++) {
             a = sc.nextLine();
            if ("*".equals(a)) {
                break;
            } 
            else if ("Hajj".equals(a)) {
                b[j]="Hajj-e-Akbar";
                j++;
            } 
            else if ("Umrah".equals(a)) {
                b[j]="Hajj-e-Asghar";
                j++;
            }
        }
        for(int i=0;i<j;i++){
        System.out.println("case" + (i+1)+ ":"+b[i]);
        }
    }
}
