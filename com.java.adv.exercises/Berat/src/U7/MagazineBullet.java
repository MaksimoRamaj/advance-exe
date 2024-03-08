package U7;

public class MagazineBullet {
    private  int capacity;
    private String[] bullets;
    private boolean isLoaded;
    private int currentBulletIndex;

    public MagazineBullet(int capacity) {
        this.capacity = capacity;
        this.isLoaded = false;
        this.currentBulletIndex = 0;
        this.bullets = new String[capacity];
    }
    public  void loadBullet(String bullet){
        if (currentBulletIndex< capacity ){
            currentBulletIndex ++;
            bullets[currentBulletIndex] = bullet;
            isLoaded = true;
            System.out.println("Loaded a cartridge: " + bullet);
        }else{
            System.out.println("Magazine is full.Cannot is loaded");
        }
    }
    public boolean isLoaded(){
        return isLoaded;
    }
    public void shot() {
        if (currentBulletIndex > 0) {
            System.out.println("Shot: " + bullets[currentBulletIndex] + " Cartridge " + currentBulletIndex);
            currentBulletIndex--;
            if (currentBulletIndex == 0) {
                isLoaded = false;
                System.out.println("Empty magazine.");
            }
        } else {
            System.out.println("Empty magazine. Cannot shoot.");
        }
    }


    public static void main(String[] args) {
        MagazineBullet magazineBullet = new MagazineBullet(5);
        System.out.println("Is loaded? " + magazineBullet.isLoaded());
        magazineBullet.loadBullet("9mm");
        magazineBullet.loadBullet("7.62mm");
        magazineBullet.loadBullet("8.9mm");
        magazineBullet.shot();
        magazineBullet.shot();
        magazineBullet.shot();
    }
}
