import java.util.Scanner;
public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b, c = 0;
        int gc[]=new int[t];
        int lc[]=new int[t];
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            for (int j = 1; j <=a; j++) {
                if (a % j == 0 && b % j == 0) {c = j;}
            }
            gc[i]=c;
            lc[i]=(a*b)/c;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(gc[i]+" "+lc[i]);
        }
        
    }
}