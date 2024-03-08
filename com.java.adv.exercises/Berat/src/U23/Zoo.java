package U23;

import java.util.*;
import java.util.stream.Collectors;

public class Zoo {
    private Map<String,Integer> mapOfAnimals;

    public Zoo() {
        this.mapOfAnimals = new TreeMap<>();
    }

    //int getNumberOfAllAnimals() → returns the number of all animals
    int getNumberOfAllAnimals(){
        int counter = 0;
        for (Map.Entry<String,Integer> entry : mapOfAnimals.entrySet()){
            int noOfAnimals = entry.getValue();
            counter = counter + noOfAnimals;
        }
        return counter;
    }
    //Map <String, Integer> getAnimalsCount() →
    // returns the number of animals of each species
    Map<String,Integer> getAnimalsCount(){
        return new TreeMap<>(mapOfAnimals);
    }

    //Map <String, Integer> getAnimalsCountSorted() → returns the number
    // of animals of each species
    //sorted based on the number of animals of a given species,
    // where the first element is always the species with
    //the largest number of animals

    Map<String,Integer> getAnimalsCountSorted(){
        Collection<Map.Entry<String, Integer>> entrySet =mapOfAnimals
                .entrySet()
                .stream()
                .sorted(
                new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -(o1.getValue() - o2.getValue());
            }
        }).collect(Collectors.toCollection(LinkedHashSet::new));

        Map<String,Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String,Integer> entry : entrySet){
            sortedMap.put(entry.getKey(),entry.getValue());
        }

        return sortedMap;
    }

    //void addAnimals(String, int) → adds n animals of a given species

    void addAnimals(String animal,int numberOfAnimals){
        if (!mapOfAnimals.containsKey(animal)){
            mapOfAnimals.put(animal,numberOfAnimals);
            return;
        }
        int actualNumberOfAnimals = mapOfAnimals.get(animal);
        actualNumberOfAnimals = actualNumberOfAnimals + numberOfAnimals;
        mapOfAnimals.put(animal,actualNumberOfAnimals);
    }


}
