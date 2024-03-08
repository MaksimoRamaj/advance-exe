package U17;

public class MeasurementConverter {
    double convert(int value,ConversionType conversionType){
        return conversionType.converter.convert(value);
    }
}
