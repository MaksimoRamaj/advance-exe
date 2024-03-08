package U24_25;

import java.util.LinkedList;
import java.util.List;

public class Basket<Item>{
    List<Item> itemList;
    public Basket() {
        this.itemList = new LinkedList<>();
    }

    //addToBasket() method,which adds the element to the basket
    // (increasing the current state by 1)

    void addToBasket(Item item) throws BasketFullException {
        if (itemList.size() == 10) {
                throw new BasketFullException();
        }
        itemList.add(item);
    }

    void removeFromBasket(){
        if (itemList.size() == 0){
            throw new BasketEmptyException();
        }
        int lastIndex = itemList.size()-1;
        itemList.remove(lastIndex);
    }

}
