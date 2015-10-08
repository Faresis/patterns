package toys;

public abstract class AnimalToy {
    private final String name;

    AnimalToy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
