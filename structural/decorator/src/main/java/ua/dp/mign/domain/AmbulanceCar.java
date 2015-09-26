package ua.dp.mign.domain;

public class AmbulanceCar extends CarDecorator {
    public AmbulanceCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void go() {
        super.go();
        System.out.println("... beep-beep-beeeeeeep ...");
    }
}
