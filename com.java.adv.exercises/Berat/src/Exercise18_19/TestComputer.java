package Exercise18_19;

public class TestComputer {
    public static void main(String[] args) {
        Computer appleComputer = new Computer("M1",16,4,"Apple","Macbook");
        Computer computer = new Computer("Intel",8,4,"HewlettPackard","Model1");
//        System.out.println(computer.toString());
//        System.out.println(appleComputer.equals(computer));
        System.out.println("Apple computer hashCode: " + appleComputer.hashCode());
        System.out.println("HP computer hashCode: " + computer.hashCode());
    }
}
