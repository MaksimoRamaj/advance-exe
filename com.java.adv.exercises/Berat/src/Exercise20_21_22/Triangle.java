package Exercise20_21_22;

public class Triangle extends Shape{

    private int baza;
    private int side2;
    private int side3;
    private int lartesi;

    public Triangle(int baza, int side2, int side3, int lartesi) {
        this.baza = baza;
        this.side2 = side2;
        this.side3 = side3;
        this.lartesi = lartesi;
    }

    @Override
    double calculatePerimeter() {
        return baza + side2 + side3;
    }

    @Override
    double calculateArea() {
        return (baza * lartesi)/2;
    }
}
