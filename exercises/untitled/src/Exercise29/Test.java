package Exercise29;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Integer[] arr = {1,3,5,7,9};

        double avg = partOf(arr,e->e%2 == 1);
        System.out.println(avg);
    }

    static <T> double partOf(T[] array, Function<T,Boolean> function){
        int count = 0;
        for (T element:array){
            if (function.apply(element)){
                count++;
            };
        }
        return (double)count/ (double) array.length * 100;
    }
}
