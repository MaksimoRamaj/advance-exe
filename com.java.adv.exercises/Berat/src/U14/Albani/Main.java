package U14.Albani;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //kemi nje array me 100_000 hapsira
        //kthe nje list me element unik

        Integer[] integers = new Integer[20];
        Random random = new Random();

        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> dubElements = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<20;i++){
            integers[i] = random.nextInt(0,30);
            //nqs provoj te shtoj dhe me rikthen false
            //do te thote qe elementi ndodhet ne uniqueElements
            if (uniqueElements.add(integers[i]) == false){
                dubElements.add(integers[i]);
            }
        }
        //shtuam vlerat ne harte bashke me frekuencat
        for (int i=0;i<20;i++){
            Integer celsi = integers[i];
            //nese doni perdorni celsi ne vend te integers[i]
            if (map.containsKey(integers[i]) == false){
                map.put(integers[i],1);
            }else {
                int frekuenca = map.get(integers[i]);
                frekuenca = frekuenca + 1;
                map.put(integers[i],frekuenca);
            }
        }
        //duhet qe ti rendisim
        //marrim entries nga map.entrySet
        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
        //Rendisim entries me ane te streams
        LinkedHashMap<Integer,Integer> sortedEntries = (LinkedHashMap<Integer, Integer>) entries
                .stream()
                .sorted(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        }).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));

        //testimi metodave
        //printimi i te gjithe numrave
        System.out.println("Printimin i te gjithe numrave: ");
        for (Integer integer : integers){
            System.out.print(integer + " ");
        }
        //printimi i numrave unik
        System.out.println("\nPrintimi i te gjithe numrave unik: ");
        for (Integer integer : uniqueElements){
            System.out.print(integer + " ");
        }
        //printimi i numrave te duplikuar
        System.out.println("\nPrintimi i numrave te duplikuar: ");
        for (Integer integer : dubElements){
            System.out.print(integer + " ");
        }
        //printimi i frekuences
        System.out.println("\nPrintimi i frekuencave: ");
        for (Map.Entry<Integer,Integer> entry : sortedEntries.entrySet()){
            System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
        }
    }
}
