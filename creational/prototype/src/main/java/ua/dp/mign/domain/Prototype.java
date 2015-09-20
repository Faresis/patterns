package ua.dp.mign.domain;

/*
 * This interface allows to implement
 * a prototype pattern. Each class that
 * will implement it will provide ability
 * to its users to copy its instances.
 * Just implementing a Cloneable is not enough
 * because it has no clone() method in its
 * public contract.
 */
public interface Prototype extends Cloneable {
    Prototype clone() throws CloneNotSupportedException;
}
