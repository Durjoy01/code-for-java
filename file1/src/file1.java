import java.io.*;
import java.util.*;

public class file1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File myfile = new File("hello");
        try {
            PrintWriter writesome = new PrintWriter(myfile);
            while (true) {
                int a = sc.nextInt();
                if (a >= 0) {
                    writesome.println(a);
                } else {
                    break;
                }
            }
            sc.close();
            writesome.close();
            
            Scanner ac=new Scanner(myfile);
            int sum=0;
            int sount=0;
            while(ac.hasNext())
            {
            int number = ac.nextInt();
            sum += number;
            sount++;
		}
		
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+((double)sum/sount));
		ac.close();
            
        } catch (IOException e) {
            System.out.println("hey");
        }

    }

}

