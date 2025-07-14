import java.util.Arrays;
import java.util.Scanner;
public class Q {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int h=0;
        for (int i = n; i>=3; i--) {
            if(a[i-1]+a[i-2]>a[i-3] && a[i-1]+a[i-3]>a[i-2] && a[i-3]+a[i-2]>a[i-1])
            {h++;
            break;}
        }
        if(h==1){System.out.println("YES");}
        else{System.out.println("NO");}
    }
}
