package Exercise38;

public class WaterContainer {
    private int size;
    private int acutalWaterLevel;
    public WaterContainer(int size) {
        this.size = size;
        acutalWaterLevel = 0;
    }

    void refill(){
        acutalWaterLevel = size;
    }

    /**
     * @param removedWater water to be removed
     * @return the actual water level after removing some water
     */
    int getWater(int removedWater){
        acutalWaterLevel = acutalWaterLevel - removedWater;
        System.out.println("Water level: " + acutalWaterLevel);
        return acutalWaterLevel;
    }
}
