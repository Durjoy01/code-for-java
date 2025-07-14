
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class hostel {

    static final int MAX_STUDENT = 5;
    static Scanner reader = new Scanner(System.in);
    static String[] special_ser = {"AC Room", "Laundry", "GYM", "Library", "Cyber Cafe"};

    class Student {

        String name;
        int id;
        String adress;
        String foods;
        int service_count;
        int[] special_services;

        Student(String name, int id, String adress, String foods, int service_count, int[] special_services) {
            this.name = name;
            this.id = id;
            this.adress = adress;
            this.foods = foods;
            this.service_count = service_count;
            this.special_services = special_services;

        }

    }

    static void showOptions() {
        System.out.print("\n\n 1. Search user.");
        System.out.print("\n 2. View all user.");
        System.out.print("\n 3. Register new user.");
        System.out.print("\n  * Enter 0 to exit *");
        System.out.print("\n Select a number to proceed:");
    }

    static void showAllSpecialService() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" " + special_ser[i]);
        }
    }

    public static void main(String[] something) {
        int state;
        System.out.println("\n Welcome to hostel management system.");
        do {
            showOptions();
            state = reader.nextInt();
            switch (state) {
                case 0:
                    break;
                case 1:
                    search();
                    break;
                case 2:
                    viewAll();
                    break;
                case 3:
                    registerUser();
                    break;
                default: {
                    System.out.println("You entered a wrong number.");
                }

            }
            System.out.println("\n\n\n");
        } while (state != 0);
        System.out.println("\n  ##### Thanks for using my system. ####\n\n");
    }

    public static void search() {
            File Myfile = new File("Customer.txt");
            
                    try {
                        Scanner readsome = new Scanner(Myfile);
                        while (readsome.hasNextLine()) 
                        {
                            Scanner sc=new Scanner(System.in);
                            String d=sc.nextLine();
                            String student=readsome.nextLine();
                            String[] arr=student.split(" ");
                           
                            if(d.equals(arr[0]))
                            {
                                System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
                            }
                        }
                        readsome.close();
                    } catch (IOException e) {
                        System.out.println("Their is some problem!!");
                        e.printStackTrace();
                    }
    }

    public static void viewAll() {
        System.out.println("View All");
        File Myfile = new File("Customer.txt");
        try {
            Scanner readsome = new Scanner(Myfile);
            while (readsome.hasNextLine()) {
                String a = readsome.nextLine();
                System.out.println(a);
            }
            readsome.close();
        } catch (IOException e) {
            System.out.println("Their is some problem!!");
            e.printStackTrace();
        }
    }

    public static void registerUser() {

        Scanner input = new Scanner(System.in);
        String name, address, food;
        int id;
        System.out.println("  # Enter student information\n");
        System.out.println(" Name: ");
        name = input.next();
        System.out.println(" ID: ");
        id = input.nextInt();
        System.out.println(" Adress: ");
        address = input.next();
        System.out.println(" Foods you want to eat: ");
        food = input.next();
        System.out.println(" List of special services: ");

        try {
            File Myfile = new File("Customer.txt");
            PrintWriter writesome = new PrintWriter(Myfile);
            writesome.println(name + " " + id + " " + address);
            writesome.close();
        } catch (IOException e) {
            System.out.println("bokachoda");
            e.printStackTrace();
        }

        showAllSpecialService();

    }
}
