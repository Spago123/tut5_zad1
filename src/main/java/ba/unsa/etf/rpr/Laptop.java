package ba.unsa.etf.rpr;

public class Laptop {
    private String operatingSystem;
    private String brand;
    private String model;
    private Integer RAM;
    private String processor;
    private String graphicalCard;
    private double displaySize;
    private Integer HDD;
    private Integer SSD;

    public Laptop(
            String operatingSystem, String brand, String model, Integer RAM, String processor, String graphicalCard,
            double displaySize, Integer HDD, Integer SSD
    ) {
        this.operatingSystem = operatingSystem;
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.processor = processor;
        this.graphicalCard = graphicalCard;
        this.displaySize = displaySize;
        this.HDD = HDD;
        this.SSD = SSD;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicalCard() {
        return graphicalCard;
    }

    public void setGraphicalCard(String graphicalCard) {
        this.graphicalCard = graphicalCard;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public Integer getHDD() {
        return HDD;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public Integer getSSD() {
        return SSD;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", RAM=" + RAM +
                ", processor='" + processor + '\'' +
                ", graphicalCard='" + graphicalCard + '\'' +
                ", displaySize=" + displaySize +
                ", HDD=" + HDD +
                ", SSD=" + SSD +
                '}';
    }
}
