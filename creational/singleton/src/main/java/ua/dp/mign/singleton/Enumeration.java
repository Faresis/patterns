package ua.dp.mign.singleton;

public enum Enumeration {
        INSTANCE;

        private Enumeration() {
            System.out.println("Enumeration singleton constructed.");
        }
}
