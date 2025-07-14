class test {
    int a;
    int b;
    test(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void meth(test obj) {
        int temp = obj.a;
        obj.b = obj.a;
        obj.a = temp;
    }
}

class Output {

    public static void main(String args[]) {
        test obj = new test(10, 20);
        obj.meth(obj);
        System.out.println(obj.a + " " + obj.b);
    }
}
