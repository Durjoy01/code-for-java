import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class J {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        int arr[] = new int[10];
        try {
            
            Scanner se=new Scanner(file);
            int i = 0;
            while (se.hasNext()) {
                String s=se.next();
                arr[i] = Integer.parseInt(s);
                i++;
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
