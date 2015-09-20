package ua.dp.mign.singleton;

/*
 * This implementation is free of any explicit synchronization
 * logic. It depends on the fact that class can't be accessed
 * while all its static members will not be initialized.
 * Although initialization is performed on demand so that
 * if resource creation is time consuming it will be created only
 * when it is requested.
 */
public class InitializationOnDemand {
    private InitializationOnDemand() {
        System.out.println("InitializationOnDemand singleton constructed.");
    }

    private static class SingletonHolder {
        private static final InitializationOnDemand INSTANCE = new InitializationOnDemand();
    }

    public static InitializationOnDemand getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
