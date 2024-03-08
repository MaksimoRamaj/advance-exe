import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storage {
    //Create a Storage class that will have a private Map field, a public constructor,
    // and methods:
    //addToStorage(String key, String value) → adding elements to the storage
    //printValues(String key) → displaying all elements under a given key
    //findValues(String value) → displaying all keys that have a given value
    //The Storage class should allow you to store multiple values under one key.
    private Map<String, Set<String>> map;

    public Storage(Map<String, Set<String>> map) {
        this.map = map;
    }

    public Storage() {
        this.map = new HashMap<>();
    }

    void addToStorage(String key,String value){
        map.computeIfAbsent(key,k->new HashSet<>()).add(value);
    }

    void printValues(String key){
       Set<String> values;
       if (!map.containsKey(key))return;
       values  = map.get(key);
       values.stream().forEach(e ->System.out.println("Key: " + key + " ,Value: " + e));
    }

    void findValues(String value){
        Set<String> keys = new HashSet<>();
        for (Map.Entry<String,Set<String>> entry : map.entrySet()){
            if (entry.getValue().contains(value)){
                keys.add(entry.getKey());
            }
        }
        keys.stream().forEach(k->System.out.print(k + " "));
    }

}
