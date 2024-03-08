package Execrise15;

public enum Runner {
    //Create an enum Runner class with constants BEGINNER, INTERMEDIATE, ADVANCED. Enum should have two
    //parameters:
    //• minimum time of running a marathon in minutes
    //• maximum running time of the marathon in minutes
    //In addition, the Runner enum should contain the static getFitnessLevel() method, which takes any time
    //result of a marathon run, and as a result should return a specific Runner object based on the given time.
    BEGINNER(0,10),
    INTERMEDIATE(10,25),
    ADVANCED(25,50);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    static Runner getFitnessLevel(int time){
        if (time< BEGINNER.maxTime)return BEGINNER;
        if (time< INTERMEDIATE.maxTime)return INTERMEDIATE;
        return ADVANCED;
    }

    public static void main(String[] args) {
        Runner r1 = getFitnessLevel(9);
        System.out.println(r1.name());
    }
}
