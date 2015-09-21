package ua.dp.mign.messages;

import ua.dp.mign.writers.MessageWriter;

/* Abstraction variation */
public class CapsMessageProcessor implements MessageProcessor {

    private MessageWriter writer;

    @Override
    public void processMessage(String message) {
        message = message.toUpperCase();
        writer.write(message);
    }

    @Override
    public void setMessageWriter(MessageWriter writer) {
        this.writer = writer;
    }
}
