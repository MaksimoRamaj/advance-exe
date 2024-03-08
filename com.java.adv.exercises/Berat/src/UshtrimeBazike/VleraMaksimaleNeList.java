package UshtrimeBazike;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VleraMaksimaleNeList{
    public static void main(String[] args) {
        //Kemi nje liste me elementet 5,100,5000,4,10
        //Te gjejme vleren maksimale ne nje liste
        List<Integer> integerList = new LinkedList<>();
        integerList.add(5);
        integerList.add(100);
        integerList.add(5000);
        integerList.add(4);
        integerList.add(10);

        Integer vleraMaxNeListe = vleraMax(integerList);

        System.out.println("Vlera maksimale: " + vleraMaxNeListe);

    }

    static Integer vleraMax(List<Integer> list){
        Integer vleraMax = Integer.MIN_VALUE;
        for (Integer element: list){
            if (element>vleraMax){
                vleraMax = element;
            }
        }
        return vleraMax;
    }

    static Integer vleraMin(List<Integer> list){
        Integer vleraMin = Integer.MAX_VALUE;
        for (Integer element: list){
            if (element<vleraMin){
                vleraMin = element;
            }
        }
        return vleraMin;
    }
}
