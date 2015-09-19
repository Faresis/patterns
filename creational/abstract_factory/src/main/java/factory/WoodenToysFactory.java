package factory;

import toys.Bear;
import toys.Cat;
import toys.WoodenCat;
import toys.WoodenBear;

public class WoodenToysFactory implements ToyFactory {
    public Bear getBear() {
        return new WoodenBear();
    }

    public Cat getCat() {
        return new WoodenCat();
    }
}
