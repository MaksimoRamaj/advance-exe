package U16;

public class Test {
    public static void main(String[] args) {
        Runner runner = Runner.getFitnessLevel(10);
        Runner runner2 = Runner.getFitnessLevel(29);
        Runner runner3;
        try {
            runner3 = Runner.getFitnessLevel(75);
        }catch (MarathonTimeExpiredException expiredException){
            System.err.println("Koha e vrapuesit runner3 shume e madhe!");
        }finally {
            runner3 = Runner.BEGGINER;
        }
        System.out.println(runner.name());
        System.out.println(runner2.name());
        System.out.println(runner3.name());
    }
}
