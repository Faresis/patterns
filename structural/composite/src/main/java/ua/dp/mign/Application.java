package ua.dp.mign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.dp.mign.tree.*;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        CompositeMessage grp1 = new CompositeMessage();
        CompositeMessage grp2 = new CompositeMessage();
        CompositeMessage grp3 = new CompositeMessage();

        SingleMessage msg1 = new SingleMessage("First message");
        SingleMessage msg2 = new SingleMessage("Second message");
        SingleMessage msg3 = new SingleMessage("Third message");
        SingleMessage msg4 = new SingleMessage("Fourth message");

        grp2.addMessage(msg1);
        grp2.addMessage(msg2);

        grp3.addMessage(msg3);
        grp3.addMessage(msg4);

        grp1.addMessage(msg1);
        grp1.addMessage(msg2);
        grp1.addMessage(msg3);
        grp1.addMessage(msg4);
        grp1.addMessage(grp2);
        grp1.addMessage(grp3);

        process(grp1);
    }

    /*
     * Client code is able to treat individual
     * objects and compositions uniformly
     */
    public void process(Message message) {
        message.print();
    }

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }
}
