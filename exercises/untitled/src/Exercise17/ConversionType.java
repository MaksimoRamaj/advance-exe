package Exercise17;

public enum ConversionType {
    //Create a ConversionType enum class with the constants METERS_TO_YARDS, YARDS_TO_METERS,
    //CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
    //Enum should have a Converter type parameter used to perform calculations for a given type.
    //Then create a MeasurementConverter class that will have the convert(int value, ConvertionType
    //conversionType) method and based on the value and type of conversion, used the Converter of the given
    //type and returned the result.
    METERS_TO_YARDS(n->n*1.093613),
    YARDS_TO_METERS(new Converter() {
        @Override
        public double convert(double toBeConverted) {
            return toBeConverted*0.9144;
        }
    }),
    CENTIMETERS_TO_INCHES(n->n*0.3937008),
    INCHES_TO_CENTIMETER(n->n*2.54),
    KILOMETERS_TO_MILES(n->n*0.6213712),
    MILES_TO_KILOMETER(n->n*1.609344);

    Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }
}
@FunctionalInterface
interface Converter{
    double convert(double toBeConverted);
}