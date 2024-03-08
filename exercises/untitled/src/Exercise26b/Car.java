package Exercise26b;

import java.util.List;

enum CarType {
    COUPE, CABRIO, SEDAN, HATCHBACK
}
class Car {
    public String name;
    public String description;
    public CarType carType;
    public Car(String name, String description, CarType carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }}

class Model {
    public String name;
    public int productionStartYear;
    List<Car> cars;
    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    } }
class Manufacturer {
    public String name;
    public int yearOfCreation;
    List<Model> models;
    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }
}

