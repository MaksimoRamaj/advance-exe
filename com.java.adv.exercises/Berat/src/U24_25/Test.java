package U24_25;

import java.util.Random;

//BasketFullException eshte checked exception sipas
//kerkeses 25 mqns ben extend class Exception
//BasketEmptyException eshte unchecked exception (RunTime exception)
//mqns ben extend RuntimeException

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Basket<Integer> basket = new Basket<>();
        //rasti kur koshi eshte full
        //
        for (int i=0;i<20;i++){
            try {
                basket.addToBasket(random.nextInt(500));
            } catch (BasketFullException e) {
                System.err.println(e.getMessage());
            }
        }

        //rasti kur duam te heqim nga koshi
        basket.removeFromBasket();


    }
}
