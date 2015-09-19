package operations;

import builders.LaptopBuilder;
import domain.Laptop;

/*
 * Describes a regular building process
 * which is separated from object presentation
 * in such a way that the same building process
 * is able to produce different presentations.
 */
public class BuyLaptop {
    private LaptopBuilder laptopBuilder;

    public void setLaptopBuilder(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop getMyLaptop() {
        return laptopBuilder.getLaptop();
    }

    public void constructLaptop() {
        laptopBuilder.createNewLaptop();
        laptopBuilder.setMonitorResolution();
        laptopBuilder.setProcessor();
        laptopBuilder.setMemory();
        laptopBuilder.setHDD();
        laptopBuilder.setBattery();
    }
}
