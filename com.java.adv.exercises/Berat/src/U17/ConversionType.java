package U17;
//Create a ConversionType enum class with the constants METERS_TO_YARDS,
// YARDS_TO_METERS,
//CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES,
// MILES_TO_KILOMETERS.
//Enum should have a Convertertype parameter used to perform calculations
// for a given type.
//Then create a MeasurementConverter class that will have the
// convert(int value, ConvertionType
//conversionType) method and based on the value and type of conversion,
// used the Converter of the given
//type and returned the result.
public enum ConversionType {
    METERS_TO_YARDS(new Converter() {
        @Override
        public double convert(int n) {
            return n * 1.093613;
        }
    }),
    YARDS_TO_METERS(n->n*0.9144),
    CENTIMETER_TO_INCHES(n->n*0.3937008),
    INCHES_TO_CENTIMETER(n->n*2.54),
    KILOMETERS_TO_MILES(n->n*0.6213712),
    MILES_TO_KILOMETERS(n->n*1.609344);

    Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }
}

interface Converter{
    double convert(int n);
}
