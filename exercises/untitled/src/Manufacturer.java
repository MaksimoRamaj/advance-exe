import java.util.List;
import java.util.Objects;

public class Manufacturer {
    //Create a Manufacturer class that will contain fields: name, year of establishment, country.
    //Include all
    //necessary methods and constructor parameters. Implement the hashCode() and equals() methods.
    String name,country;
    int yearOfEstablishment;

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public Manufacturer(String name, String country, int yearOfEstablishment) {
        this.name = name;
        this.country = country;
        this.yearOfEstablishment = yearOfEstablishment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEstablishment == that.yearOfEstablishment && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, yearOfEstablishment);
    }
}

//Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list
//(Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3). Include all
//necessary methods and constructor parameters. Implement the hashcode() and equals() methods.

