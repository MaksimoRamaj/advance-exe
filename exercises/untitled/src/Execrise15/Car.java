package Execrise15;

public enum Car implements Comparable<Car>{
    FERRARI(200_000,400,true),
    PORSCHE(120_000,350,true),
    MERCEDES(180_000,325,true),
    BMW(175_000,425,true),
    OPEL(30_000,172,false),
    FIAT(15_000,125,false),
    TOYOTA(70_000,250,false);
    private double price;
    private int power;
    boolean premium;

    Car(double price, int power,boolean premium) {
        this.price = price;
        this.power = power;
    }

    boolean isPremium(){
        return this.premium;
    }

    boolean isRegular(){
        return !this.premium;
    }

    boolean isFasterThan(Car that){
        int ans = Integer.compare(this.power,that.power);
        if (ans > 0){
            System.out.println(this + " is faster than " + that);
            return true;
        }if (ans <0){
            System.out.println(that +" is faster than " + this);
            return false;
        }else {
            System.out.println("Both " + this + " and " + that + " have the same speed!");
            return false;
        }
    }

    public static void main(String[] args) {
        Car ferrari = Car.FERRARI;
        Car fiat = Car.FIAT;
        System.out.println(ferrari.isFasterThan(fiat));
    }

}
