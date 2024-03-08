package U15;

public class Test {
    public static void main(String[] args) {
        Car bmw = Car.BMW;
        Car ferrari = Car.FERRARI;
        Car opel = Car.OPEL;

        System.out.println("Is bmw premium? " + bmw.isPremium());
        ferrari.isFasterThan(bmw);
        System.out.println();
        opel.isFasterThan(ferrari);
    }
}
