package robot.box;

import java.util.Scanner;

public class RobotBox {

    public static void main(String[] args) {

        System.out.print("U CAN PLAY WITH ONLY 's' and 'd' AND U GOT 10 LIFE\n");
        System.out.print("[robot] []    []\n");
        System.out.print("[]      []    []\n");
        System.out.print("[]      []    []\n");
        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            char a = sc.next().charAt(0);
            if (a == 's') {
                System.out.print("[]      []   []\n");
                System.out.print("[robot] []   []\n");
                System.out.print("[]      []   []\n");
                char c = sc.next().charAt(0);

                if (c == 'd') {
                    System.out.println("[]    []     []\n");
                    System.out.println("[]  [robot]  []\n");
                    System.out.println("[]    []     []\n");
                    char f = sc.next().charAt(0);

                    if (f == 's') {
                        System.out.println("[]    []    []\n");
                        System.out.println("[]    []    []\n");
                        System.out.println("[]  [robot] []\n");
                        char g = sc.next().charAt(0);

                        if (g == 'd') {
                            System.out.println("winner");
                        } else if (g == 'a') {
                            System.out.println("dead");

                            continue;
                        }

                    } else if (f == 'd') {
                        System.out.println("dead");

                        continue;
                    }

                } else if (c == 's') {
                    System.out.println("dead");

                    continue;
                }

            } else if (a == 'd') {
                System.out.println("dead");

                continue;
            }

        }
    }

}
