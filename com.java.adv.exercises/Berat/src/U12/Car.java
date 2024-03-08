package U12;

import java.util.Objects;

public class Car {
    String name;
    String model;
    double price;
    int year;
    Manufacturer manufacturer;

    Engine engine;

    public Car(String name, String model, double price, int year,
               Manufacturer manufacturer,Engine engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && year == car.year && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, year, manufacturer);
    }
}
