import java.util.*;
import java.util.stream.Collectors;

public class Zoo {
    Map<String,Integer> animals;

    public Zoo(Map<String, Integer> animals) {
        this.animals = animals;
    }

    public Zoo(String animal) {
        this.animals = new TreeMap<>();
        animals.put(animal,1);
    }

    int getNumberOfAllAnimals(){
        int countAnimals=0;
        for (Map.Entry<String,Integer> entry : animals.entrySet()){
            countAnimals = countAnimals + entry.getValue();
        }
        return countAnimals;
    }

    Map<String,Integer> getAnimalsCount(){
        return new TreeMap<>(animals);
    }

    Map<String,Integer> getAnimalsCountSorted(){
        Map<String,Integer> sortedMap = new LinkedHashMap<>();
        Set<Map.Entry<String,Integer>> entryList = animals.entrySet();

        entryList = entryList.stream().sorted(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        }).collect(Collectors.toCollection(LinkedHashSet::new));

        for (Map.Entry<String,Integer> entry:entryList){
            sortedMap.put(entry.getKey(),entry.getValue());
        }

        return sortedMap;
    }

    void addAnimals(String animal,int n){
        if (animals.containsKey(animal)){
            int noOfAnimals = animals.get(animal);
            noOfAnimals +=n;
            animals.put(animal,noOfAnimals);
        }
        animals.put(animal,n);
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Elephant");
        //elephant 1
        zoo.addAnimals("Rhino",25);
        zoo.addAnimals("Alpaaca",100);
        //Rhino 25
        zoo.addAnimals("Kangaro",15);
        zoo.addAnimals("Penguin",3);

        Map<String,Integer> map = zoo.getAnimalsCount();
        Map<String,Integer> mapSorted = zoo.getAnimalsCountSorted();
        System.out.println("No of animals: " + zoo.getNumberOfAllAnimals());
        System.out.println("Unsorted: " + map.toString());
        System.out.println("Sorted: " + mapSorted.toString());
    }

}
