//Name:Durjoy barua
//Id:2131766642
//date:16/06/2022
package starpluspattern;
public class StarPlusPattern {
    public static void main(String[] args) {
    char a = '*';
        for (int i = 1; i <= 9; i+=2) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(a);
            }
                if (a == '*') {
                    a = '+';
                } else {
                    a = '*';
                }
                System.out.println();
        }
    }

}