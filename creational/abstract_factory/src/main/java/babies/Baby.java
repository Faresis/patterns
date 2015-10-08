package babies;

import factory.ToyFactory;
import toys.Cat;
import toys.Bear;

public abstract class Baby {
    private final String name;

    Baby(String name) {
        this.name = name;
    }

    public void play(ToyFactory toys) {
        Bear bear = toys.getBear();
        Cat cat = toys.getCat();
        System.out.printf("I am %s.\n", name);
        System.out.printf("I have got %s and %s.\n", bear.getName(), cat.getName());
    }
}
