package ua.dp.mign.singleton;

/*
 * This implementation relies on the fact that no one can
 * access class members while static initialization is not
 * finished.
 * Having this we are instantiating our singleton during
 * initialization of static field.
 */
public class Eager {
    private static final Eager INSTANCE = new Eager();

    private Eager() {
        System.out.println("Eager singleton constructed.");
    }

    public static Eager getInstance() {
        return INSTANCE;
    }
}
