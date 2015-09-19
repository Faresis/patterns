package toys;

public abstract class AnimalToy {
    private String name;

    protected AnimalToy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
