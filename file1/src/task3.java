import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class task3 {
    public static void main(String[] args) {
        File f=new File("numbers.txt");
        int array[]=new int[10];
        try{
            Scanner read=new Scanner(f);
            int count=0;
            while(read.hasNext())
            {
                System.out.println("");
                String s=read.next();
                array[count]=Integer.parseInt(s);
                count++;
            }
            read.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        int min=array[0],max=array[0];
        for(int i=0;i<10;i++)
        {
            if(array[i]>max)
                max=array[i];
            if(array[i]<min)
                min=array[i];
            System.out.println(array[i]);
        }
        System.out.println("Minimun number: "+min+" Maximum number: "+max);
    }
}