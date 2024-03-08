package U6;

import java.util.TreeMap;

public class Ushtrimi6 {

    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("A","5151");
        treeMap.put("B","100");
        treeMap.put("C","1515");
        treeMap.put("L","15");
        acceptTreeMap(treeMap);

        String str;
    }

    //Create a method that accepts TreeMap and
    // prints the first and last EntrySet in the console.
    static void acceptTreeMap(TreeMap<String,String> treeMap){
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}
