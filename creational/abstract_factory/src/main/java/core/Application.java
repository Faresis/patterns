package core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import babies.*;
import factory.*;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        Baby boy = new BabyBoy();
        Baby girl = new BabyGirl();

        /*
         * Abstract factory allows creator/manager to specify
         * which implementation will be provided to a specific actor
         * while all actors can have the same processign implementation
         * and be unaware of which implementation is provided for them.
         */
        boy.play(new WoodenToysFactory());
        girl.play(new TeddyToysFactory());
    }
}
