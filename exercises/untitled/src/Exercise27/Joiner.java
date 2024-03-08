package Exercise27;

public class Joiner<T>{
    String separator;
    public Joiner(String separator) {
        this.separator = separator;
    }

    String join(T ...obj){
        StringBuilder str = new StringBuilder();
        for (int i=0;i< obj.length-1;i++){
            str.append(obj[i].toString());
            str.append(separator);
        }
        str.append(obj[obj.length-1]);
        return str.toString();
    }

    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner<>("-");
        String str = joiner.join(1,2,3,4);
        System.out.println(str);
    }
}
