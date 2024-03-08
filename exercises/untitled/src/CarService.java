import java.util.*;
import java.util.stream.Collectors;

public class CarService {
    //Create a CarService class that will contain a list of cars and implement the following methods:
    //1. adding cars to the list,
    //2. removing a car from the list,

    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    void addCar(Car car){
        cars.add(car);
    }

    boolean removeCar(Car car){
        if (!cars.contains(car)){
            throw new RuntimeException(car.name+" is not on our list!");
        }
        return cars.remove(car);
    }

    //3. returning a list of all cars,
    //4. returning cars with a V12 engine,
    //5. returning cars produced before 1999,
    //6. returning the most expensive car,
    //7. returning the cheapest car,
    //8. returning the car with at least 3 manufacturers,
    //9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
    //10. checking if a specific car is on the list,
    //11. returning a list of cars manufactured by a specific manufacturer,
    //12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,
    //=,! = from the given
    List<Car> manuByManuWithYearOfEsta(Manufacturer manufacturer,String comparison,int year){
        return cars.stream().filter(car -> {
            int yearOfManufacturer = car.manufacturers.stream()
                    .filter(m->m.equals(manufacturer))
                    .mapToInt(Manufacturer::getYearOfEstablishment)
                    .findFirst().orElse(0);

                    switch (comparison) {
                        case "<":
                            return yearOfManufacturer < year;
                        case ">":
                            return yearOfManufacturer > year;
                        case "<=":
                            return yearOfManufacturer <= year;
                        case ">=":
                            return yearOfManufacturer >= year;
                        case "=":
                            return yearOfManufacturer == year;
                        case "!=":
                            return yearOfManufacturer != year;
                        default:
                            return false;
                    }}).collect(Collectors.toList());
    }

    List<Car> specificManufacturerUStream(Manufacturer manufacturer){
        return cars.stream().filter(car -> car.manufacturers.contains(manufacturer)).collect(Collectors.toList());
    }

    List<Car> specificManufacturer(Manufacturer manufacturer){
        List<Car> tempCars = new ArrayList<>();
        for (Car car:cars){
            for (Manufacturer mf: car.manufacturers){
                if (mf.equals(manufacturer)){
                    tempCars.add(car);
                }
            }
        }
        return tempCars;
    }

    boolean contains(Car car){
        return cars.contains(car);
    }

    List<Car> sorted(String word){
        if (word.equals("ascending")) {
            return cars.stream().sorted((o1, o2) -> o1.yearOfManufacture - o2.yearOfManufacture).collect(Collectors.toList());
        }
        if (word.equals("descending")) {
            return cars.stream().sorted((o1, o2) -> -(o1.yearOfManufacture - o2.yearOfManufacture)).collect(Collectors.toList());
        }else throw new RuntimeException("Word not correct");
    }

    List<Car> atLeastThreeManufacturers(){
        return cars.stream().filter(car -> car.manufacturers.size()>2).collect(Collectors.toList());
    }

    Optional<Car> cheapestCar(){
        return cars.stream().min(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price-o2.price;
            }
        });
    }

    Optional<Car> mostExpensiveCar(){
        return cars.stream().max(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price-o2.price;
            }
        });
    }

    List<Car> carList(){
        return cars;
    }

    List<Car> v12Cars(){
        return cars.stream().filter(car -> car.engine == Engine.V12).collect(Collectors.toList());
    }

    List<Car> producedBefore99(){
        return cars.stream().filter(car -> car.yearOfManufacture==1992).collect(Collectors.toList());
    }

}
