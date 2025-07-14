
import java.util.Scanner;

public class Z {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char h = sc.next().charAt(0);
        int b = sc.nextInt();
        int c = sc.nextInt();
        char j = sc.next().charAt(0);
        int d = sc.nextInt();
        int e, f;
        e=a*60+b;
        f=c*60+d;
        int ava=(e+f)/2;
        int hour,min;
        hour=ava/60;
        min=ava%60;
        
        System.out.println(hour+":"+min);
        
        
    }
}
