package U26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise26{

    public static void main(String[] args) {

        List<Model> mercedesModelList = Arrays.asList(
                new Model("EveryDayCars", 1975,
                        Arrays.asList(
                                new Car("BClass", "dsc1", CarType.SEDAN),
                                new Car("AClass", "dsc1", CarType.HATCHBACK),
                                new Car("SClass", "dsc1", CarType.COUPE),
                                new Car("EClass", "dsc1", CarType.CABRIO)
                        )),
                new Model("WorkCars", 1980,
                        Arrays.asList(
                                new Car("XClass", "dsc1", CarType.SEDAN),
                                new Car("RClass", "dsc1", CarType.HATCHBACK)
                        )
                )
        );
        List<Model> fordModelList = Arrays.asList(
                new Model("FamilyCars", 1931,
                        Arrays.asList(
                                new Car("fiesta", "dsc1", CarType.HATCHBACK),
                                new Car("focus", "dsc1", CarType.HATCHBACK),
                                new Car("edge", "dsc1", CarType.HATCHBACK),
                                new Car("Kuga", "dsc1", CarType.SEDAN)
                        )),
                new Model("SportsCars", 1930,
                        Arrays.asList(
                                new Car("Mustang", "dsc1", CarType.CABRIO)
                        )
                )
        );

        Manufacturer manufacturer = new Manufacturer("Mercedes"
                , 1940, mercedesModelList);
        Manufacturer manufacturer2 = new Manufacturer("Ford"
                , 1929, fordModelList);

        List<Manufacturer> manufacturerList = new ArrayList<>();
        manufacturerList.add(manufacturer);
        manufacturerList.add(manufacturer2);



        List<Model> allModels = u1(manufacturerList);
    //Printo modelet e makinave
//        allCars.stream()
//                .forEach(model ->{
//            System.out.println(model.name);
//        });
    //Printo makinat
        List<Car> allCars = u2_1(allModels);
    //Pika 3
        List<String> manufacturersNames = u3(manufacturerList);
//        manufacturersNames.stream().forEach(
//                name -> System.out.println(name)
//        );
    // pika 4 d-sh
    //pika 5
        //beni testimin e pikes 5
    //pika 6 d-sh
        //e ngjashme me piken 5
    //testimi pikes 7
    //pika 8 d-sh e ngjashme me 7

        List<Model> modeleVitProdhimCift = u9(manufacturerList);
//        modeleVitProdhimCift.stream()
//                .forEach(model ->
//                        System.out.println(model.name)
//                );
    //List makina
        List<Car> carList = u11(manufacturerList);
        carList.stream().forEach(car -> System.out.println(car.name));

    }

    static List<Car> u11(List<Manufacturer> manufacturerList){

        List<Car> carList =manufacturerList
                .stream()
                .filter(manufacturer -> manufacturer.yearOfCreation % 2 == 1)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear % 2 == 0)
                .flatMap(model -> model.cars.stream())
                .collect(Collectors.toList());
        return carList;
    }

    static List<Manufacturer> u10(List<Manufacturer> manufacturerList){
        List<Manufacturer> manufacturers = manufacturerList
                .stream()
                .filter(manufacturer -> manufacturer.yearOfCreation % 2 == 0)
                .collect(Collectors.toList());
        return manufacturers;
    }

    static List<Model> u9(List<Manufacturer> manufacturerList){

    List<Model> models = manufacturerList
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear%2==0).collect(Collectors.toList());
    return models;
    }

    //list of all car names
    static List<String> u7(List<Manufacturer> manufacturerList){
        List<String> stringList = new ArrayList<>();
        manufacturerList
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .flatMap(model -> model.cars.stream())
                .forEach(car -> stringList.add(car.name));
        return stringList;
    }

    //list of all model names,
    static List<String> u5(List<Manufacturer> manufacturerList){
        List<String> stringList = new ArrayList<>();
        manufacturerList
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .forEach(model -> stringList.add(model.name));
        return stringList;
    }

    static List<Car> u2(List<Manufacturer> manufacturerList){
        List<Car> carList = manufacturerList
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .flatMap(model -> model.cars.stream())
                .collect(Collectors.toList());
        return carList;
    }

    static List<String> u3(List<Manufacturer> manufacturerList){
        List<String> manufacturerNames = new ArrayList<>();

        manufacturerList
                .stream()
                .forEach(manufacturer ->
                        manufacturerNames.add(manufacturer.name)
                );

        return manufacturerNames;
    }

    static List<Car> u2_1(List<Model> models){
        List<Car> carList = models.stream()
                .flatMap(model -> model.cars.stream())
                .collect(Collectors.toList());
        return carList;
    }

    static List<Model> u1(List<Manufacturer> manufacturerList){
        List<Model> modelList = manufacturerList
                .stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .collect(Collectors.toList());
        return modelList;
    }
}
