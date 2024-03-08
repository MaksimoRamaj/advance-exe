package Exercise13.U12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarService {
    List<Car> listOfCars;

    public static void main(String[] args) {
        List<Car> list = Arrays.asList(
                new Car(2002),
                new Car(2001),
                new Car(1990),
                new Car(2010),
                new Car(2020),
                new Car(2021)
        );
        CarService carService = new CarService(list);
        List<Car> list1 = carService.sortedCars("descending");
        for (Car car:list1){
            System.out.println(car.year);
        }
    }

    public CarService() {
        this.listOfCars = new ArrayList<>();
    }
    public CarService(List<Car> list){this.listOfCars = list;}

    //adding cars to the list,
    boolean addCars(Car car) {
        return listOfCars.add(car);
    }

    List<Car> sortedCars(String order){
        List<Car> sortedList = new ArrayList<>(listOfCars);
        if (order.toLowerCase().equals("descending")){
            Collections.sort(sortedList,Collections.reverseOrder());
            return sortedList;
        }
        Collections.sort(sortedList);
        return sortedList;
    }

    //pika 4

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