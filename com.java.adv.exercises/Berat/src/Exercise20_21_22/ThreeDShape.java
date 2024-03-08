package Exercise20_21_22;

public abstract class ThreeDShape extends Shape implements Fillable{
   double actualFluidVolume;
   abstract double calculateVolume();

   @Override
   public void fill(){
      double volume = calculateVolume();
        actualFluidVolume = actualFluidVolume + 50;
        if (actualFluidVolume>volume){
            System.out.println("Water overflow! Vellimi aktual " + actualFluidVolume);
        } else if (actualFluidVolume == volume) {
            System.out.println("3DShape is full with water! Vellimi aktual" + actualFluidVolume);
        }else {
            System.out.println("Not enough water! Vellimi aktual" + actualFluidVolume);
        }
   }
}
