package ua.dp.mign.tree;

import java.util.List;
import java.util.ArrayList;

public class CompositeMessage implements Message {

    private final List<Message> messages;

    public CompositeMessage() {
        messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    @Override
    public void print() {
        System.out.println("***** Start of composite message *****");
        for(Message message : messages) {
            message.print();
        }
        System.out.println("***** End of composite message *****");
    }
}
