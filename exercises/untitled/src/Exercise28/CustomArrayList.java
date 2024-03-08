package Exercise28;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomArrayList<E> extends ArrayList<E> {

    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");
            list.add("e");
            list.add("f");
            list.add("g");
        List<String> ans = list.getEveryNthElement(2,3);
        for (String str: ans){
            System.out.print(str);
        }
    }

    List<E> getEveryNthElement(int indexToStart,int skip){
        List<E> list = new CustomArrayList<>();
        if (!this.isEmpty()){
            for (int i=indexToStart;i<this.size();i=i+skip+1){
                list.add(this.get(i));
            }
        }
        return list;
    }
}
