package exceptionexc;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class courseSolt {
    public static void course() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        Map<String, Integer> mp = new HashMap<>();
        
        //cse
        mp.put("cse115", 3);
        mp.put("cse115l", 1);
        mp.put("cse173", 3);
        mp.put("cse215", 3);
        mp.put("cse215l", 1);
        System.out.print("How many CSE course you want to take: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <=n; i++) {
            String d = sc.nextLine();
                        if ("cse115".equals(d) || "cse115l".equals(d) || "cse173".equals(d) || "cse215".equals(d) || "cse215l".equals(d)) {
                            sum = sum + mp.get(d);
                        } else {
                            try {
                                throw new cseException();
                            } catch (cseException e) {
                                System.out.println("CSE course does not match(start form the beginning)");
                            }
                        }
        }
        //mat
        System.out.print("How many MAT course you want to take: ");
        int a = sc.nextInt();
        sc.nextLine();
        mp.put("mat116", 3);
        mp.put("mat120", 3);
        mp.put("mat125", 3);
        mp.put("mat130", 3);
        for (int i = 0; i < a; i++) {  
            String d = sc.nextLine();
                    if ("mat116".equals(d) || "mat120".equals(d) || "mat125".equals(d) || "mat130".equals(d)) {
                        sum = sum + mp.get(d);
                    } else {
                        try {
                            throw new matException();
                        } catch (matException e) {
                            System.out.println("MAT course does not match(start form the beginning)");
                        }
                    }
        }
        //ged
        System.out.print("How many GED course you want to take: ");
        int b = sc.nextInt();
        sc.nextLine();
        mp.put("phi104", 3);
        mp.put("ben103", 3);
        mp.put("eng103", 3);
        mp.put("eng111", 3);
        for (int i = 0; i < b; i++) { 
            String d = sc.nextLine();
             
                    if ("phi104".equals(d) || "ben103".equals(d) || "eng103".equals(d) || "eng111".equals(d)) {
                        sum = sum + mp.get(d);
                    } else {
                        try {
                            throw new gedException();
                        } catch (gedException e) {
                            System.out.println("GED course does not match(start form the beginning)");
                        }
                    }
            if (sum <= 13) {
                System.out.println("Successful");
            } else {
                        try {
                            throw new creditException();
                        } catch (creditException e) {
                            System.out.println("you have selected credit over the limit");
                        }
            }
        }
    }
}
