package Exercise20_21_22;

public class Rectangular extends Shape{

    private int gjatesi;
    private int gjeresi;

    Rectangular(int gjatesi,int gjeresi){
        this.gjatesi = gjatesi;
        this.gjeresi = gjeresi;
    }

    @Override
    double calculatePerimeter() {
        return 2*gjatesi + 2*gjeresi;
    }

    @Override
    double calculateArea() {
        return gjatesi*gjeresi;
    }
}
