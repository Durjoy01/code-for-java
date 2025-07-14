import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        File file=new File("src/quiz marks.txt");
        
        int size=0;
        try{
            Scanner read= new Scanner(file);
            while(read.hasNext())
            {
                read.nextLine();
                size++;
            }
            read.close();
        }
        catch(FileNotFoundException e)
        {e.printStackTrace();}
        
        Quiz[] array=new Quiz[size];
        int index=0;
        try{
            Scanner read= new Scanner(file);
            while(read.hasNext())
            {
                String student=read.nextLine();
                String[] arr=student.split(" ");
                array[index]=new Quiz(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
                index++;
            }
            read.close();
        }catch(FileNotFoundException e)
        {e.printStackTrace();}
        
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i].toString());
        }
        
        int cemp= array[0].marks;
        int cempid=array[0].id;
        
        for(int i=1;i<array.length;i++)
        {
            if(array[i].marks>cemp)
            {
                cemp=array[i].marks;
                cempid=array[i].id;
            }
        }
        System.out.println("highest="+cempid);
    }
}

class Quiz {

    int id;
    int marks;

    Quiz() {
        this.id = 0;
        this.marks = 0;
    }

    Quiz(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "id=" + id + ", marks=" + marks + '}';
    }
}
