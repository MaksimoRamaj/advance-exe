package U23;

public class Test{
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals("Zebra",20);
        zoo.addAnimals("Penguins",4);
        zoo.addAnimals("Lions",2);
        zoo.addAnimals("Giraffe",15);

//        System.out.println("Total kafshe: " + zoo.getNumberOfAllAnimals());
        System.out.println("Speciet te gjitha: " + zoo.getAnimalsCount());
        System.out.println("Speciet e renditura sipas numrit: " + zoo.getAnimalsCountSorted());

        zoo.addAnimals("Zebra",2);
        System.out.println("Speciet te gjitha: " + zoo.getAnimalsCount());
    }
}
