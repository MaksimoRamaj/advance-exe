import java.util.List;
import java.util.Objects;

public class Car{
    String name,model;
    int price,yearOfManufacture;
    List<Manufacturer> manufacturers;
    Engine engine;

    public Car(String name, String model, int price, int yearOfManufacture,Engine engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
    }

    public Car(String name, String model, int price, int yearOfManufacture, List<Manufacturer> manufacturers) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturers = manufacturers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(yearOfManufacture, car.yearOfManufacture) && Objects.equals(manufacturers, car.manufacturers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturers);
    }
}
