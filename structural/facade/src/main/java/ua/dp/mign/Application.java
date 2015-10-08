package ua.dp.mign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.dp.mign.ski.services.SkiResortFacade;

@SpringBootApplication
public class Application implements CommandLineRunner {

    /*
     * Client code has nothing to do with each ski service in a separate.
     * It can use facade to easily reach the point.
     */
    @Override
    public void run(String... strings) throws Exception {
        SkiResortFacade facade = new SkiResortFacade();
        System.out.printf("Good rest price: %d,\n" +
                          "Rest with own skis price: %d\n",
                          facade.haveGoodRest(10, 50, 46, 2, 3),
                          facade.haveRestWithOwnSkis());
    }

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }
}
