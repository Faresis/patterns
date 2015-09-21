package ua.dp.mign.tree;

import java.util.List;
import java.util.ArrayList;

public class CompositeMessage implements Message {

    private List<Message> messages;

    public CompositeMessage() {
        messages = new ArrayList<Message>();
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    @Override
    public void print() {
        System.out.println("***** Start of composit message *****");
        for(Message message : messages) {
            message.print();
        }
        System.out.println("***** End of composit message *****");
    }
}
