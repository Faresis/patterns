package ua.dp.mign.domain;

public class ArmoredCar extends CarDecorator {
    public ArmoredCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void go() {
        System.out.println("Armor prepared. We are safe to go.");
        super.go();
    }
}
