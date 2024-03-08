package Exercise17;

public class MeasurementConverter {
    public double convert(int value,ConversionType conversionType){
        return conversionType.converter.convert(value);
    }

    public static void main(String[] args) {
        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println(measurementConverter.convert(100,ConversionType.MILES_TO_KILOMETER));
    }
}
