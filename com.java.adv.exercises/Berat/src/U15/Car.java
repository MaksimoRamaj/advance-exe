package U15;


//Create a Car enum class with FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA
// etc. constants.
//Each vehicle has its own parameters, e.g. price, power, etc.
// Enum should contain boolean isPremium() and
//boolean isRegular() methods.
// The isPremium() method should return the opposite result to the call of the
//isRegular() method.
//In addition, the boolean isFasterThan()
// method should be declared and implemented as part of the enum
//class. This method should accept the Car type object and display information that the indicated vehicle is
//faster or not than the vehicle provided in the argument.
// To do this, use the compareTo() method.
public enum Car{
    FERRARI(400_000,450,true),
    PORSCHE(150_000,352,true),
    MERCEDES(180_000,300,true),
    BMW(150_000,370,true),
    OPEL(20_000,120,false),
    FIAT(25_000,75,false),
    TOYOTA(80_000,200,false);
    private double price;
    private int power;
    private boolean premium;

    Car(double price, int power, boolean premium) {
        this.price = price;
        this.power = power;
        this.premium = premium;
    }

    boolean isPremium(){
        return premium;
    }

    boolean isRegular(){
        return !premium;
    }

    public void isFasterThan(Car other){
        int comparisonResult = this.isFasterThanComparison(other);

        if (comparisonResult > 0){
            System.out.println(this + " is faster than " + other);
        } else if (comparisonResult == 0) {
            System.out.println(this + " have the same speed as " + other);
        }else {
            System.out.println(other + " is faster than " + this);
        }

    }

    private int isFasterThanComparison(Car other){
        return this.power - other.power;
    };

}
