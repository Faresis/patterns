package ua.dp.mign.singleton;

/*
 * This implementation use method synchronization.
 * While code is cleaner it will suffer of performance
 * issues.
 */
public class Synchronized {
    private Synchronized() {
        System.out.println("Synchronized singleton constructed.");
    }
    private static volatile Synchronized instance;

    public static synchronized Synchronized getInstance() {
        if(instance == null) {
            instance = new Synchronized();
        }
        return instance;
    }
}
