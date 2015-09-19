package builders;

public class TripLaptopBuilder extends LaptopBuilder {

    @Override
    public void setMonitorResolution() {
        this.getLaptop().setMonitorResolution("1200x800");
    }

    @Override
    public void setProcessor() {
        this.getLaptop().setProcessor("Core i3, 2.1 GHz");
    }

    @Override
    public void setMemory() {
        this.getLaptop().setMemory("2048 Mb");
    }

    @Override
    public void setHDD() {
        this.getLaptop().setHDD("250 Gb");
    }

    @Override
    public void setBattery() {
        this.getLaptop().setBattery("6 lbs");
    }
}
