package UshtrimeBazike;

//Krijoni nje klase makina, me te gjitha karakteristikat e makinave
//Krijoni nje garazh i cili mban makina
//Krijoni metodat per te parkuar makina ne garazh
//Krijoni metodat per te larguar makinat nga garazhi

//Klasa main do perdoret si testim i klases makina
public class Main {
    public static void main(String[] args) {
        GarazhiMakinave garazhiMakinave = new GarazhiMakinave();

        Makina makina = new Makina("Gri","AA 505 AB",5);
        Makina ford = new Makina("Blu","AA 300 AC",5);
        Makina bmw = new Makina("E zeze","AB 125 AA",3);

        String ngjyra = makina.getNgjyra();
        String targa = makina.getTarga();
        int numriDyereve = makina.getNumriDyereve();
        String ngjyraFordit = ford.getNgjyra();
        //Shtoj makina ne garazhd
        boolean uShtua = garazhiMakinave.shtoMakineNeGarazh(makina);
        System.out.println("Shto makina: " + uShtua);
        //tentoj te heq makine
        boolean pergjigja = garazhiMakinave.hiqMakinen(makina);
        System.out.println("Tentoj te heq makinen: " + pergjigja);
        System.out.println("Makina ford: Ngjyra: " + ford.getNgjyra() + " ,targa: " + ford.getTarga() + ",numriDyereve: " + ford.getNumriDyereve());
        System.out.println("Makina makina: Ngjyra: " + ngjyra + " ,targa: " + targa + ",numriDyereve: " + numriDyereve);
    }
}
