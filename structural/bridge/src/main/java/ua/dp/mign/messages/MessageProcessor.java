package ua.dp.mign.messages;

import ua.dp.mign.writers.MessageWriter;

/* Abstraction */
public interface MessageProcessor {
    void processMessage(String message);
    /* Bridge */
    void setMessageWriter(MessageWriter writer);
}
