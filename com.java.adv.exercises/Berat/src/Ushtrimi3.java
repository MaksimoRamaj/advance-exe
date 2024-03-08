import java.util.HashMap;
import java.util.Map;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Map<String,Number> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Java",18);
        stringIntegerMap.put("PHP",4);
        stringIntegerMap.put("Javascript",6);

        printMap(stringIntegerMap);
    }
    static private void printMap(Map<String,Number> map){
        if (map.isEmpty()){
            throw new RuntimeException("Harta Bosh!");
        }
        int count = 0;
        String key = "";
        Number value = Integer.MIN_VALUE;
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,Number> entry : map.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (count== map.size()-1){
                break;
            }
            count++;
            System.out.println("Key: " + key + " Value: " + value + ",");
        }
        System.out.println("Key: " + key + " Value: " + value + ".");
    }
}
