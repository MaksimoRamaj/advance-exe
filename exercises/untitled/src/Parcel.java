public class Parcel implements Validator {
    int xLength,yLength,zLength;
    float weight;
    boolean isExpress;

    @Override
    public boolean validate(Parcel input) {
        return false;
    }
}
