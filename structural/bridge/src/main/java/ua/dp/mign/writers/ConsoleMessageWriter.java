package ua.dp.mign.writers;

/* Implementation */
public class ConsoleMessageWriter implements MessageWriter {

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
