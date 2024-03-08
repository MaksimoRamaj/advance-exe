package Exercise18_19;

import java.util.Objects;

public class Laptop extends Computer{
    private String battery;
    public Laptop(String processor, int ram, int graphicsCard, String company, String model, String battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(this.getBattery(), laptop.getBattery())
                && Objects.equals(this.getCompany(),laptop.getCompany())
                && Objects.equals(this.getModel(),laptop.getModel())
                && Objects.equals(this.getProcessor(),laptop.getProcessor()
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
