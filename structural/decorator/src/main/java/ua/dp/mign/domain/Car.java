package ua.dp.mign.domain;

public abstract class Car {
    private final String brandName;

    protected Car(String brandName) {
        this.brandName = brandName;
    }

    private final String getBrandName() {
        return this.brandName;
    }

    /* Default functionality */
    public void go() {
        System.out.println("I'm " + getBrandName() + " and I'm on my way...");
    }
}
