package Exercise32;

import java.io.Serializable;

public class Car implements Serializable {
    String targa;
    String marka;

    public Car(String targa, String marka) {
        this.targa = targa;
        this.marka = marka;
    }
}
