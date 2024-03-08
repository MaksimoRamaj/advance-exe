package Exercise26b;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Model> EuCars = Arrays.asList(
          new Model("Internal Combustion",1992,Arrays.asList(
                  new Car("BMW-5-Series","D1",CarType.CABRIO),
                  new Car("Mercedes","D1",CarType.SEDAN))),
                new Model("EV",2000,Arrays.asList(
                        new Car("Tesla","D2",CarType.COUPE)
                ))
        );

        List<Model> USCars =  Arrays.asList(
                new Model("Internal Combustion",1992,Arrays.asList(
                        new Car("Dodge","D1",CarType.CABRIO),
                        new Car("Ford","D1",CarType.SEDAN))),
                new Model("EV",2000,Arrays.asList(
                        new Car("Lucid Air","D2",CarType.COUPE)
                ))
        );

        List<Manufacturer> manufacturers = Arrays.asList(
                new Manufacturer("GmBh",1950,EuCars),
                new Manufacturer("America",1961,USCars)
        );

//        manufacturers.stream().forEach(manufacturer -> {
//            manufacturer.models.stream().forEach(model -> );
//        });

//        manufacturers.stream().forEach(manufacturer -> System.out.println(manufacturer.yearOfCreation));

//        manufacturers.stream().forEach(manufacturer -> System.out.println(manufacturer.name));

//        modelList.stream().forEach(c->{
//            System.out.println("Model name: " + c.name);
//            System.out.println("Cars: " );
//            c.cars.stream().forEach(car -> System.out.println(car.name));
//        });
        //list of all cars
        //modelList.stream().forEach(model -> {
        //model.cars.stream().forEach(car -> System.out.println(car.name));
        //});

    }
}
