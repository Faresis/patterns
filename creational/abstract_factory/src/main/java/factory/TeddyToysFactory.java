package factory;

import toys.Bear;
import toys.TeddyBear;
import toys.Cat;
import toys.TeddyCat;

public class TeddyToysFactory implements ToyFactory {
    public Bear getBear() {
        return new TeddyBear();
    }

    public Cat getCat() {
        return new TeddyCat();
    }
}
