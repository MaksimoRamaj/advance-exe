package Exercise20_21_22;

public class Cube extends ThreeDShape{
    int brinja;
//    double actualFluidVolume;

    public static void main(String[] args) {
        fillWithWater(new Cube(5));
    }

    static void fillWithWater(Fillable trupi){
        trupi.fill();
    }

    public Cube(int brinja) {
        this.brinja = brinja;
    }

    @Override
    double calculatePerimeter() {
        return brinja*12;
    }

    @Override
    double calculateArea() {
        return 6*brinja*brinja;
    }

    @Override
    double calculateVolume() {
        return Math.pow(brinja,3);
    }

//    @Override
//    public void fill() {
//        double volume = calculateVolume();
//        actualFluidVolume = actualFluidVolume + 50;
//        if (actualFluidVolume>volume){
//            System.out.println("Water overflow!");
//        } else if (actualFluidVolume == volume) {
//            System.out.println("Cube is full with water!");
//        }else {
//            System.out.println("Not enough water!");
//        }
//    }

}
