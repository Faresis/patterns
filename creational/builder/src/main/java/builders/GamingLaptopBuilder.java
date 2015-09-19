package builders;

public class GamingLaptopBuilder extends LaptopBuilder {

    @Override
    public void setMonitorResolution() {
        this.getLaptop().setMonitorResolution("1920x1200");
    }

    @Override
    public void setProcessor() {
        this.getLaptop().setProcessor("Core 2 Duo, 3.2 GHz");
    }

    @Override
    public void setMemory() {
        this.getLaptop().setMemory("6144 Mb");
    }

    @Override
    public void setHDD() {
        this.getLaptop().setHDD("500 Gb");
    }

    @Override
    public void setBattery() {
        this.getLaptop().setBattery("6 lbs");
    }
}
