import java.util.*;

public class Ushtrimi1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("b","x","a","z","B","X","A","Z");
        List<String> reverseSortedList = reverseSortListCaseInsensitive(list);
        for (String element:reverseSortedList){
            System.out.print(element + " ");
        }

    }

    static List<String> reverseSortListCaseInsensitive(List<String> list){
        List<String> toLowerCaseStringList = new ArrayList<>();

        for (String element:list){
            toLowerCaseStringList.add(element.toLowerCase());
        }

        Collections.sort(toLowerCaseStringList,Comparator.reverseOrder());
        return toLowerCaseStringList;
    }

    static List<String> reverseSortList(List<String> list){
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }
}
