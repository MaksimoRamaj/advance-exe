package U14.Albani;

import java.util.*;

public class UniqueItemsFromGroups {
    public static void main(String[] args) {

        List<List<String>> groups = createRandomGroups();
        Set<String> uniqueItems = new HashSet<>();
        for (List<String>group : groups){
            uniqueItems.add(group.get(0));//Ruajm vetem nje kopje
            // te elementit te pare
        }
        //Hiqni dyfishimin  e artikujve ne liste
        List<String> uniqueItemList = new ArrayList<>(uniqueItems);

        //Printoni artikujt unike
        System.out.println("Artikujt unike: ");
        for (String item : uniqueItemList){
            System.out.println(item);
        }
    }
    //Metoda per krijuar grupet e elementeve te rastesishem
    private static List<List<String>> createRandomGroups(){
        List<List<String>> groups = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            List<String> group = new ArrayList<>();
            int groupSize = random.nextInt(5) + 1; // Grupi ka 1 deri në 5 elemente
            for (int j = 0; j < groupSize; j++) {
                group.add("Element " + (i * 5 + j + 1)); // Vlera e zgjedhur rastësisht
            }
            groups.add(group);
        }
        return groups;
    }
}








