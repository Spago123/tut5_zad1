package ba.unsa.etf.rpr;

/**
 * Example of a builder pattern class
 * @author Harun Spago
 * @version 1.0.0
 */
public class App {
    public static void main( String[] args ) {
        Laptop l1 = new LaptopBuilder().setOperatingSystem("Win 10").setBrand("Acer").setRAM(16).setHDD(1024).setProcessor("Intel i7").build();
        System.out.println(l1);
    }
}
