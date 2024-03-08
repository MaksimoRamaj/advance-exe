package Review;

import java.util.*;

public class Storage {
    //Create a Storage class that will have a private Map field, a public constructor, and methods:
    //addToStorage(String key, String value) -adding elements to the storage
    //printValues(String key) - displaying all elements under a given key
    //findValues(String value) - displaying all keys that have a given value
    //The Storage class should allow you to store multiple values under one key.
    private Map<String, Set<String>> map;

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("maksimo","Berat");
        storage.addToStorage("maksimo","Tirane");
        storage.addToStorage("ergysi","Korce");
        storage.addToStorage("ergysi","Tirane");
        storage.addToStorage("redi","Korce");

        storage.findValues("Berat");
    }

    public Storage() {
        this.map = new TreeMap<>();
    }

    void findValues(String value){
        for (Map.Entry<String,Set<String>> entry:map.entrySet()){
            if (entry.getValue().contains(value)){
                System.out.println("Key: " + entry.getKey());
            }
        }
    }

    void printValues(String key){
        if (map.containsKey(key)){
            Set<String> set = map.get(key);
            for (String s:set){
                System.out.println(s+" ");
            }
        }else {
            throw new RuntimeException("Key not found!");
        }
    }
    void addToStorage(String key,String value){
        if (!map.containsKey(key)){
            Set<String> strings = new TreeSet<>();
            map.put(key,strings);
        }
        Set<String> set = map.get(key);
        set.add(value);
        map.put(key,set);
    }
}
