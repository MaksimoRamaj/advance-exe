package U24_25;

public class BasketEmptyException extends RuntimeException{
    public BasketEmptyException() {
        super("Basket is empty!");
    }
}
