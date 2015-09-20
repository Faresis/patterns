package ua.dp.mign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.*;

import ua.dp.mign.log.LogManager;
import ua.dp.mign.log.CustomizedLogManager;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        LogManager logger = context.getBean(CustomizedLogManager.class);
        logger.log("calling side message.");
    }
}
