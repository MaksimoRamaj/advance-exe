package Exercise20_21_22;

public class Test {

    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(5,10);
        Triangle triangle = new Triangle(3,4,5,4);
        //mund qe ti referohemi edhe nga prindi
        Shape triangle2 = new Triangle(5,6,7,5);
        System.out.println("Siperfaqja e drejtkendeshit: "+rectangular.calculateArea()
        + " Perimetri i drejtkendeshit: " + rectangular.calculatePerimeter());
        System.out.println("Siperfaqja e trekendeshit: "+triangle.calculateArea()
                + " Perimetri i trekendeshit:  " + triangle.calculatePerimeter());
    }
}
