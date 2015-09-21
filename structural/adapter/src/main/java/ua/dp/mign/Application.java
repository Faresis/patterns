package ua.dp.mign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.dp.mign.newsystem.*;
import ua.dp.mign.legacysystem.*;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        // user
        SecurityOptionsPrinter printer = new SecurityOptionsPrinter();

        // modern interface
        SecurityOptionsProvider fs = new FileSystemSecurityOptionsProvider();

        // basic usage
        System.out.println("File system access: ");
        printer.print(fs);

        // we need to get access to a legacy code
        SecurityOptionsReader db = new DBSecurityOptionsProvider();

        // this can't be passed as is to the existing code
        // printer.print(db);
        // compilation error
        // incompatible interfaces

        // here adapter come in to the play
        SecurityOptionsProvider dbn = new DBSecurityOptionsAdapter(db);

        System.out.println("DB system access: ");
        printer.print(dbn);
    }
}
