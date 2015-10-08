package ua.dp.mign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import ua.dp.mign.singleton.*;

@SpringBootApplication
class Application implements CommandLineRunner {

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(8);
        for(int i = 0; i < 8; ++i) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0; i < 10000; ++i) {
                        DoubleCheckedLocking.getInstance();
                        Eager.getInstance();
                        Enumeration.INSTANCE.toString();
                        InitializationOnDemand.getInstance();
                        Synchronized.getInstance();
                    }
                    System.out.println("Runnable finished.");
                }
            });
        }
    }
}
