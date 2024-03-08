package Ushtrimi1_2Avanc;

public class Makina implements Comparable<Makina> {
    int fuqiMotorike;
    String marka;

    public Makina(int fuqiMotorike, String marka) {
        this.fuqiMotorike = fuqiMotorike;
        this.marka = marka;
    }

    @Override
    public int compareTo(Makina other) {
       if (this.fuqiMotorike == other.fuqiMotorike){
           return this.marka.charAt(0)-other.marka.charAt(0);
       }
       return this.fuqiMotorike - other.fuqiMotorike;
    }
}
