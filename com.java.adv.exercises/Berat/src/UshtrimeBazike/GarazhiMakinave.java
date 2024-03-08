package UshtrimeBazike;

import java.util.ArrayList;
import java.util.List;

public class GarazhiMakinave {
    private List<Makina> listaMakinave;

    public GarazhiMakinave(){
        listaMakinave = new ArrayList<>();
    }

    public GarazhiMakinave(Makina makina){
        listaMakinave = new ArrayList<>();
        listaMakinave.add(makina);
    }

    public List<Makina> getListaMakinave() {
        return listaMakinave;
    }

    public void setListaMakinave(List<Makina> listaMakinave) {
        this.listaMakinave = listaMakinave;
    }

    public boolean shtoMakineNeGarazh(Makina makina){
        boolean uShtua = this.listaMakinave.add(makina);
        return uShtua;
    }

    public boolean hiqMakinen(Makina makina){
        boolean uHoq = this.listaMakinave.remove(makina);
        return uHoq;
    }


}
