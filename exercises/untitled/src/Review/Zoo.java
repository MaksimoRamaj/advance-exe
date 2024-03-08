package Review;

import java.util.*;
import java.util.stream.Collectors;

public class Zoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals("Alpacha",5000);
        zoo.addAnimals("Penguin",30);
        zoo.addAnimals("Lion",2);
        zoo.getAnimalsCount();
        System.out.println(zoo.getNumberOfAllAnimals());
        Map<String,Integer> map = zoo.getAnimalsCountSorted();
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("AnimalL: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
    Map<String,Integer> animals;

    public Zoo() {
        this.animals = new TreeMap<>();
    }

    Map <String, Integer> getAnimalsCount(){
        return new TreeMap<>(animals);
    }

    void addAnimals(String animal,int number){
        if (!this.animals.containsKey(animal)){
            animals.put(animal,number);
            return;
        }
        int noOfAnimals = animals.get(animal);
        noOfAnimals = noOfAnimals + number;
        animals.put(animal,noOfAnimals);
    }

    Map <String, Integer> getAnimalsCountSorted(){
        Set<Map.Entry<String,Integer>> sortedSet = animals.entrySet().stream().sorted(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        }).collect(Collectors.toCollection(LinkedHashSet::new));

        Map<String,Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> entry:sortedSet){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }

    int getNumberOfAllAnimals(){
        int count = 0;
        for (Map.Entry<String,Integer> entry:animals.entrySet()){
            count = count + entry.getValue();
        }
        return count;
    }
}
