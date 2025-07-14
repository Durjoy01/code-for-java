
public class Box {

    double width = 1;
    double height = 1;
    double depth = 1;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth  = depth ;
    }

    public void method() {
        double vol = width * height * depth;
        System.out.println("Width="+width+" Height="+height+" Depth="+depth+" Volume="+vol);
    }
}
