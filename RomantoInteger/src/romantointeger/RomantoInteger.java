package romantointeger;

import java.util.*;

public class RomantoInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Map<String, Integer> mp = new HashMap<>();
        mp.put("I", 1);
        mp.put("V", 5);
        mp.put("X", 10);
        mp.put("L", 50);
        mp.put("C", 100);
        mp.put("D", 500);
        mp.put("M", 1000);
        int sum = 0;
        for (int i =0; i< a.length() ; i++) {
            if (i>0&&mp.get(a.charAt(i)) > mp.get(a.charAt(i - 1))) {
                sum = sum + mp.get(a.charAt(i))-2*mp.get(a.charAt(i-1));
                i++;
                System.out.println("i");
            } else {
                sum = sum + mp.get(a.charAt(i));
                System.out.println("2");
            }
        }
        System.out.println(sum);
    }
}
