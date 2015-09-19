package builders;

import domain.Laptop;

/*
 * Abstract builder specifies a set of steps
 * that are needed to be overriden by each
 * concrete builder.
 * Those steps are used during regular
 * building process.
 */
public abstract class LaptopBuilder {
    private Laptop laptop;

    public void createNewLaptop() {
        this.laptop = new Laptop();
    }

    public Laptop getLaptop() {
        return this.laptop;
    }

    public abstract void setMonitorResolution();
    public abstract void setProcessor();
    public abstract void setMemory();
    public abstract void setHDD();
    public abstract void setBattery();
}
