package Exercise20_21_22;

public class Shape3DTest{
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        Cone cone = new Cone(8,5);

        System.out.println("\nVellimi i konit: "  + cone.calculateVolume()
        +"\nSiperfaqja e konit: " + cone.calculateArea() +
                "\nPerimetri i konit: " + cone.calculatePerimeter());

//        System.out.println("\nVellimi i kubit: "  + cube.calculateVolume()
//                +"\nSiperfaqja e kubit: " + cube.calculateArea() +
//                "\nPerimetri i kubit: " + cube.calculatePerimeter());

        for (int i=0;i<5;i++){
            cone.fill();
        }
    }
}
