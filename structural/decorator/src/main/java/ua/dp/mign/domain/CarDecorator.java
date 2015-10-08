package ua.dp.mign.domain;

public abstract class CarDecorator extends Car {
    private final Car decoratedCar;
    CarDecorator(Car decoratedCar) {
        super("");
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void go() {
        this.decoratedCar.go();
    }
}
