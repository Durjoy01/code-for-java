
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class NewClass {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        if (h == 1) {
            try {
                File Myfile = new File("Hello.txt");
                FileWriter Writesome = new FileWriter("Hello.txt");
                Writesome.write("hello  name is d");
                Writesome.close();
                Scanner readsome = new Scanner(Myfile);
                while (readsome.hasNextLine()) {
                    String a = readsome.nextLine();
                    System.out.println(a);
                }
                readsome.close();
            } catch (IOException e) {
                System.out.println("bokachoda");
                e.printStackTrace();
            }
        } else {
            hi();
        }

    }

    public static void hi() {
        File Myfile = new File("Hello.txt");
        if (Myfile.delete()) {
            System.out.println("Deleted the file: " + Myfile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

}
