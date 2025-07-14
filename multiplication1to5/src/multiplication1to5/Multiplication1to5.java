//Name:Durjoy barua
//Id:2131766642
//date:16/06/2022
package multiplication1to5;
public class Multiplication1to5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                int sum = i * j;
                System.out.println(i + "x " + j + " =" + sum);
            }
        }
    }
}