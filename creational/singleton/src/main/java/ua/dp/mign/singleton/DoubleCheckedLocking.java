package ua.dp.mign.singleton;

/*
 * This implementation provides double check for empty instance.
 * First and quickest one before synchronization. It will allow
 * us to avoid synchronization efforts when instance will already
 * be created.
 * Second one is performed after thread achieved a lock on the object.
 * It is needed because a few threads can pass first check simultaneously.
 * So the first one is for speedup and second one for single instance guarantee.
 * Nevertheless this implementation is actual only for Java >= 5
 */
public class DoubleCheckedLocking {
    private DoubleCheckedLocking() {
            System.out.println("DoubleCheckedLocking singleton constructed.");
    }

    private static volatile DoubleCheckedLocking instance;

    public static DoubleCheckedLocking getInstance() {
        if(instance == null) {
            synchronized(DoubleCheckedLocking.class) {
                if(instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
