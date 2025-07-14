import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        int arr[] = new int[10];
        try {
            Scanner sc = new Scanner(file);
                        while (sc.hasNext()) {
                            System.out.print(sc.nextLine());
                        }
                        sc.close();
            Scanner se=new Scanner(file);
            int i = 0;
            while (se.hasNext()) {
                String s=se.next();
                arr[i] = Integer.parseInt(s);
                i++;
            }
            int max = arr[0];
            int min = arr[0];
            for (int j = 1; j < arr.length; j++) {
                System.out.println(arr[j]);
                if (arr[j] > max) {
                    max = arr[j];
                } else if (arr[j] < min) {
                    min = arr[j];
                }
            }
            System.out.println("Max=" + max + ", Min=" + min);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}