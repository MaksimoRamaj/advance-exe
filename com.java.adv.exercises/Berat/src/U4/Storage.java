package U4;

import java.util.*;

public class Storage {
    //Create a Storage class that will have a private Map field,
    // a public constructor, and methods:
    //addToStorage(String key, String value) → adding elements to the storage
    //printValues(String key) → displaying all elements under a given key
    //findValues(String value) → displaying all keys that have a given value
    //The Storage class should allow you to store multiple values under one key.
    private Map<String, Set<String>> map;

    public Storage() {
        this.map = new LinkedHashMap<>();
    }

    void addToStorage(String key,String value){
        if (!map.containsKey(key)){
            Set<String> strings = new LinkedHashSet<>();
            map.put(key,strings);
        }
        Set<String> stringSet = map.get(key);
        stringSet.add(value);
        map.put(key,stringSet);
    }

    void printValues(String key){
        if (map.containsKey(key)){
            Set<String> stringSet = map.get(key);
            for (String string : stringSet){
                System.out.println("Vlera: " + string);
            }
        }
    }
    //findValues(String value) → displaying all keys that have a given value

    void findValues(String value){
        for (Map.Entry<String,Set<String>> entry : map.entrySet()){
            if (entry.getValue().contains(value)){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("5000","Berat");
        storage.addToStorage("5000","Otllak");
        storage.addToStorage("5000","Kombinat");
        storage.addToStorage("6000","Tirane");
        storage.addToStorage("6000","Kombinat");

//        storage.printValues("6000");

        storage.findValues("Otllak");

    }
}
