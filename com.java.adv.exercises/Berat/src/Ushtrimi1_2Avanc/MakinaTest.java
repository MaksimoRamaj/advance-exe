package Ushtrimi1_2Avanc;

import jdk.dynalink.linker.LinkerServices;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MakinaTest{
    public static void main(String[] args) {
        List<Makina> makinat = Arrays.asList(
                new Makina(300,"OPEL"),
                new Makina(150,"BMW"),
                new Makina(200,"Audi")
        );
        //para
        for (Makina makina : makinat){
            System.out.print(makina.marka + " ");
        }
        System.out.println("\nPas renditjes!\n");
        Collections.sort(makinat, Comparator.reverseOrder());
        //pas renditjes
        for (Makina makina:makinat){
            System.out.println(makina.marka + " ");
        }
    }
}
