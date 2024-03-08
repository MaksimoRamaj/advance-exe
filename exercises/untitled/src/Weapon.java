import java.util.Stack;

public class Weapon {
    //Create a class imitating a weapon magazine. The class should be able to define
    // the size of the magazine
    //using the constructor. Implement the methods:
    //loadBullet(String bullet) → adding a cartridge to the magazine,
    // does not allow loading more cartridges
    //than the capacity of the magazine
    //isLoaded() → returns information about whether the weapon is loaded
    // (at least one cartridge) or not
    //shot() → each call shots one bullet (prints string value in console)
    // - the last loaded cartridge - and
    //prepares the next one, loaded before the last one, if there are no more cartridges, it prints "empty
    //magazine" in the console
    String[] bullets;
    int current;
    public Weapon(int size) {
        this.bullets = new String[size];
        current = -1;
    }

    void loadBullet(String bullet){
        current++;
        if (current == bullets.length){
            System.out.println("Weapon is full!");
            return;
        }
        bullets[current] = bullet;
    }

    boolean isLoaded(){
        return current >= 0;
    }

    void shot(){
        if (isLoaded()){
            System.out.println(bullets[current]);
            current--;
            return;
        }
        System.out.println("Empty Magazine!");
    }
}
