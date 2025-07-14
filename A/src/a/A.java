package a;

class X {

    public X() {
        System.out.println(1);
    }
}

class Y extends X {

    public Y() {
        System.out.println(2);
    }
}

public class A {

    public static void main(String args[]) {
        Y d = new Y();

    }
}
