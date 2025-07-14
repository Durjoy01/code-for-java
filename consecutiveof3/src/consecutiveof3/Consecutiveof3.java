package consecutiveof3;

import java.util.Scanner;

public class Consecutiveof3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size=");
        int a = sc.nextInt();
        int n[] = new int[a];
        
        for (int i = 0; i < a; i++) {
            n[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < a; i++) {
            if (n[i] == n[i + 1]) {
                temp++;
            }
            if (temp == 3) {
                System.out.println(n[i]);
            } else {
                temp = 0;
            }
        }
    }
}
