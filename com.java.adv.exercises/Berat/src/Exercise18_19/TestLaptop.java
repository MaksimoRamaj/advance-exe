package Exercise18_19;

public class TestLaptop {

    public static void main(String[] args) {

        Laptop laptop =
                new Laptop("M1",8, 4,
                        "Apple","macbook","Apple1500");
        //metode e klases laptop
        System.out.println(laptop.getBattery());
        //metode e klases comptuer
        System.out.println(laptop.getRam());
    }
}
