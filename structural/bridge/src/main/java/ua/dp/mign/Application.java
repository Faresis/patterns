package ua.dp.mign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.dp.mign.messages.*;
import ua.dp.mign.writers.*;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        /* implementations */
        MessageWriter console = new ConsoleMessageWriter();
        MessageWriter file = new FileMessageWriter("out.txt");

        /* abstraction */
        MessageProcessor caps = new CapsMessageProcessor();
        MessageProcessor low = new LowMessageProcessor();

        caps.setMessageWriter(console);
        low.setMessageWriter(console);

        caps.processMessage("Attention!");
        low.processMessage("ATTENTION!");
        caps.processMessage("Attention!");
        low.processMessage("ATTENTION!");
        caps.processMessage("Attention!");
        low.processMessage("ATTENTION!");

        caps.setMessageWriter(file);
        low.setMessageWriter(file);

        caps.processMessage("Attention!");
        low.processMessage("ATTENTION!");
        caps.processMessage("Attention!");
        low.processMessage("ATTENTION!");
        caps.processMessage("Attention!");
        low.processMessage("ATTENTION!");
    }

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }
}
