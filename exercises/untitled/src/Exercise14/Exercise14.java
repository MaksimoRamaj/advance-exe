package Exercise14;

import java.util.*;

public class Exercise14 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] arr = new Integer[10];
        Set<Integer> set = new TreeSet<>();
        Set<Integer> repeatedAtLeastOnce = new TreeSet<>();
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i=0;i<10;i++){
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
             if (!set.add(arr[i])){
                 repeatedAtLeastOnce.add(arr[i]);
             };
             if (!map.containsKey(arr[i])){
                   map.put(arr[i],1);
             }else {
                 map.compute(arr[i],(key,value)-> value=value+1);
             }
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println("K: " + entry.getKey()+"V: " + entry.getValue());
        }


    }
}
