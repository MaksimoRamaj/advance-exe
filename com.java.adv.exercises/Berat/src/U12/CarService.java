package U12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {
    List<Car> listOfCars;

    public CarService() {
        this.listOfCars = new ArrayList<>();
    }

    //adding cars to the list,
    boolean addCars(Car car) {
        return listOfCars.add(car);
    }
    //pika 2
    boolean removeCar(Car car){
        return listOfCars.remove(car);
    }
    //pika 3
    List<Car> returnListOfCar(){
        return new ArrayList<>(this.listOfCars);
    }
    //pika 4
    List<Car> v12Cars(){
        List<Car> listOfV12Cars = new ArrayList<>();
        //iterojme listen
        for (Car car:listOfCars){
            if (car.engine.equals(Engine.V12)){
                listOfV12Cars.add(car);
            }
        }
        return listOfV12Cars;
    }

    //pika 5
    List<Car> carsBefore1999(){
        List<Car> listOfCarsBefore1999 = new ArrayList<>();
        for (Car car : listOfCars){
            if (car.year <= 1999){
                listOfCarsBefore1999.add(car);
            }
        }
        return listOfCarsBefore1999;
    }

    List<Car> carsWithV12() {
        List<Car> listOfV12Cars = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.engine == Engine.V12) {
                listOfV12Cars.add(car);
            }
        }
        return listOfV12Cars;
    }

}