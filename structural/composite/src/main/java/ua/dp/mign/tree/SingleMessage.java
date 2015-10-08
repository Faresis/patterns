package ua.dp.mign.tree;

/* Leaf */
public class SingleMessage implements Message {

    private final String message;

    public SingleMessage(String message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println(message);
    }
}
