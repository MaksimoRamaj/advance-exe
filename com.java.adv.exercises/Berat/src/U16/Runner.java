package U16;

import java.awt.image.renderable.RenderableImage;

public enum Runner {
    BEGGINER(30,70),
    INTERMEDIATE(15,30),
    ADVANCED(0,15);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    static Runner getFitnessLevel(int time){
        if (time>=70){
            throw new MarathonTimeExpiredException("Koha perfundoi!");
        }
        if (time >= 30 && time < 70){
            return Runner.BEGGINER;
        }else if (time >= 15){
            return Runner.INTERMEDIATE;
        }else {
            return Runner.ADVANCED;
        }
    }
}
