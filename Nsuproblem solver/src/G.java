import java.util.Scanner;
public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0;
        for (int i = 1; i <= n; i++) {
           int a = sc.nextInt();
           if(a!=i){
           temp++;}
        }
        
        if (temp > 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
