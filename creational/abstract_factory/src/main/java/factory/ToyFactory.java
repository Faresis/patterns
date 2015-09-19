package factory;

import toys.Bear;
import toys.Cat;

/*
 * Abstract factory that provides an interface for creating
 * families of related or dependent objects without specifying
 * their concrete classes.
 */
public interface ToyFactory {
    Bear getBear();
    Cat getCat();
}
