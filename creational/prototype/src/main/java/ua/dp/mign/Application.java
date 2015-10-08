package ua.dp.mign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ua.dp.mign.domain.*;

@SpringBootApplication
class Application implements CommandLineRunner {

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        CalendarEvent event = new CalendarEvent("Friday", new Priority("Top"));

        System.out.println("Current event:" + event);

        /*
         * This code is a user of a prototype pattern
         * which takes advantage of creating a new object
         * basing on existing one.
         */
        CalendarEvent plannedEvent = event.clone();
        plannedEvent.getPriority().setLevel("Low");

        System.out.println("Current event:" + event);
        System.out.println("Planned event:" + plannedEvent);
    }
}
