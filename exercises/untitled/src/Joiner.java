public class Joiner<T>{

    String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner<>("-");
        String str = joiner.join(1,0,5,8,6,9);
        System.out.println(str);
    }

    String join(T... obj){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i< obj.length;i++){
            stringBuilder.append(obj[i]);
            if (i<obj.length-1){
                stringBuilder.append(separator);
            }
        }
        return stringBuilder.toString();
    }

}
