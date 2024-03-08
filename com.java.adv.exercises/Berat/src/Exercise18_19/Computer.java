package Exercise18_19;

import java.util.Objects;

public class Computer {
    private String processor;
    private int ram;
    private int graphicsCard;
    private String company;
    private String model;

    public Computer() {
    }

    public Computer(String processor, int ram, int graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Kompjuteri ka keto parametra: " +
                "\nModeli: " + this.model +
                "\nProcessori: " + this.processor +
                "\nRAM: " + this.ram +
                "\nCompany: " + this.company +
                "Graphics: " + this.graphicsCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return this.ram == computer.ram && this.graphicsCard == computer.graphicsCard && Objects.equals(processor, computer.processor) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(int graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
