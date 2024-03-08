package Exercise13.U12;

public class Test {
    public static void main(String[] args) {
        Manufacturer volvo = new Manufacturer("Volvo",1960,"Sweden");
        Manufacturer skoda = new Manufacturer("Skoda",1965,"Germany");
        Manufacturer fiat = new Manufacturer("Fiat",1950,"Italy");

        Car fiat500 = new Car("Fiat500","model1",25000,2019,fiat,Engine.S3);
        Car VolvoXC90 = new Car("Volvo","XC90",60000,2022,volvo,Engine.V12);
        Car SkodaRapid = new Car("Skoda","Rapid",15000,2020,skoda,Engine.V6);

        System.out.println("Model: " + fiat500.model + " Engine: " + fiat500.engine +
                " Manufacturer name: " + fiat500.manufacturer.name +
                " Manufacturer establishment year: " +
                fiat500.manufacturer.year);
    }
}
