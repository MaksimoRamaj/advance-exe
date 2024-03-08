import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OurArrayList<E> extends ArrayList<E> {
    List<E> getEveryNthElement(int startIndex,int skip){
        List<E> list = new ArrayList<>();
        for (int i=startIndex;i<this.size();i=i+skip+1){
            list.add(this.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        OurArrayList<String> list = new OurArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        List<String>list2 = list.getEveryNthElement(2,3);
        System.out.println(list2);
    }
}
