package Review;


import java.util.Map;
import java.util.TreeMap;

public class Methods {
    //Create a method that accepts TreeMap and prints the first and last EntrySet in the console.
    static <Key,Value> void acceptTreeMap(TreeMap<Key, Value> treeMap){
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }

    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("5005","Berat");
        treeMap.put("4000","Tirane");
        treeMap.put("2000","Durres");

        acceptTreeMap(treeMap);
    }
}
