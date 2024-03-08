package U17;

public class Test {
    public static void main(String[] args) {
        MeasurementConverter measurementConverter = new MeasurementConverter();
        double rezultati = measurementConverter.convert(15,ConversionType.CENTIMETER_TO_INCHES);
        System.out.println(rezultati);
    }
}
