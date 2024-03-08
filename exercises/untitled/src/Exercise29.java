import java.util.function.Predicate;

public class Exercise29 {
    static <T> double partOf(T[] array, Predicate<T> condition){
        int countElementsThatSatisfyCondition = 0;
        for (T item:array){
            if (condition.test(item)){
                countElementsThatSatisfyCondition++;
            }
        }
        return (double) countElementsThatSatisfyCondition/array.length * 100;
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        for (int i=0;i<10;i++){
            integers[i] = i+1;
        }
        System.out.println(partOf(integers,num->num%2==0));
    }
}
