import Exercise17.BasketFullException;

import java.util.ArrayList;
import java.util.List;

public class Basket<Item>{
    List<Item> itemList;
    public Basket() {
        this.itemList = new ArrayList<>();
    }

    void addToBasket(Item item,int index){
        if (index<=0 || index>=10){
            throw new RuntimeException("Innaprioriate indexes!");
        }
        itemList.add(index,item);
    }

    Item removeFromBasketAt(int index){
        if (index<=0 || index>=10){
            throw new BasketFullException("Basket is full!");
        }
        Item toBeReturned = itemList.get(index);
        itemList.set(index,null);
        return toBeReturned;
    }
}
