package domain;

import com.google.common.base.MoreObjects;

public class Laptop {
    private String monitorResolution;
    private String processor;
    private String memory;
    private String hdd;
    private String battery;

    public void setMonitorResolution(String monitorResolution) {
        this.monitorResolution = monitorResolution;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHDD(String hdd) {
        this.hdd = hdd;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("monitorResolution", monitorResolution)
                          .add("processor", processor)
                          .add("memory", memory)
                          .add("hdd", hdd)
                          .add("battery", battery)
                          .toString();
    }
}
