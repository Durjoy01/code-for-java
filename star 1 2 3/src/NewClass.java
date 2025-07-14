
class Student {

    private String name;
    private int roll;
    private int marks;

    Student(String a) {
        this.name=a;
    }

    Student(int roll, int mark) {
        this.roll=roll;
        this.marks=mark;
    }

    public void printName() {
        System.out.println(name + " " + roll + " " + marks);
    }
}

class NewClass {

    public static void main(String[] args) {
        Student a = new Student("xyz");
        Student b = new Student(3, 512);
        a.printName();
        b.printName();
    }
}
