//Name:Durjoy barua
//Id:2131766642
//date:16/06/2022
package divisibleby8;
public class DivisibleBy8 {
    public static void main(String[] args) {
        int i = 150;
        while (i > 100) {
            if (i%8==0) {
                System.out.println(i);
            }
            i--;
        }
    }
}