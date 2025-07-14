package student;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "", gender = "";
        int id = 0, section = 0;
        double cgpa = 0.0;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter name of student " + i + " : ");
            name = sc.nextLine();
            System.out.println("Enter ID of student " + i + " : ");
            id = sc.nextInt();
            System.out.println("Enter Section of student " + i + " : ");
            section = sc.nextInt();
            System.out.println("Enter CGPA of student " + i + " : ");
            cgpa = sc.nextDouble();
            System.out.println("Enter gender of student " + i + " : ");
            sc.nextLine();
            gender = sc.nextLine();

            if ((gender.equals("Female") || gender.equals("female")) && name.length() == 4) {
                System.out.println("Gender is female and Name length is 4. Student info : ");
                System.out.println("Student ID : " + id);
                System.out.println("Student Section : " + section);
            } else if ((gender.equals("Male") || gender.equals("male")) && name.charAt(0) == 'S') {
                System.out.println("Gender is male and Name starts with S. Student info : ");
                System.out.println("Student Name : " + name);
                System.out.println("Cgpa : " + cgpa);
            }
        }
    }
}
