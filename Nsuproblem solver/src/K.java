
import java.util.Scanner;

public class K {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        String b[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
            b[i] = sc.nextLine();
        }
        
        int t = sc.nextInt();
        String c[] = new String[t];
        for (int i = 0; i < t; i++) 
            {
                c[i] = sc.nextLine();
            }
            
            for (int h = 0; h < t; h++) {
                for (int k = 0; k < n; k++) {
                    if (a[k].equals(c[h])) {
                        System.out.println(b[k]);
                    }
                }
            }
    }
}
