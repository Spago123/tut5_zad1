package ba.unsa.etf.rpr;

/**
 *Laptop Builder is an example of a build pattern class that is able to build new laptop for us
 * that contain the properties that we wish
 */
public class LaptopBuilder {
    private String operatingSystem;
    private String brand;
    private String model;
    private Integer RAM;
    private String processor;
    private String graphicalCard;
    private double displaySize;
    private Integer HDD;
    private Integer SSD;

    public LaptopBuilder(){
    }

    public LaptopBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public LaptopBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public LaptopBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public LaptopBuilder setRAM(Integer RAM) {
        this.RAM = RAM;
        return this;
    }

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setGraphicalCard(String graphicalCard) {
        this.graphicalCard = graphicalCard;
        return this;
    }

    public LaptopBuilder setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public LaptopBuilder setHDD(Integer HDD) {
        this.HDD = HDD;
        return this;
    }

    public LaptopBuilder setSSD(Integer SSD) {
        this.SSD = SSD;
        return this;
    }

    public Laptop build(){
        return new Laptop(operatingSystem, brand, model, RAM, processor, graphicalCard, displaySize, HDD,SSD);
    }
}
