package countvowel;

import java.util.Scanner;

public class CountVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        countVowels(a);
    }

    public static void countVowels(String arg) {
        String b = arg;
        int temp = 0;
        for (int i = 0; i < b.length(); i++) {
            char a = b.charAt(i);
            if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                temp++;
            }
        }
        System.out.println(temp);
    }
}
