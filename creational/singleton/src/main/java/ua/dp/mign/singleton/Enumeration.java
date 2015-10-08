package ua.dp.mign.singleton;

public enum Enumeration {
        INSTANCE;

        Enumeration() {
            System.out.println("Enumeration singleton constructed.");
        }
}
