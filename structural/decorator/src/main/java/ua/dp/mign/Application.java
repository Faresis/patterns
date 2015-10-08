package ua.dp.mign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ua.dp.mign.domain.*;

@SpringBootApplication
class Application implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        /*
         * by wrapping default implementation with new decorators
         * we are getting new features in runtime
         * without source class modifications.
         */
        Car mers = new Mercedes();
        Car ambulanceMers = new AmbulanceCar(mers);
        Car armoredMers = new ArmoredCar(mers);
        Car armoredAmbulanceMers = new ArmoredCar(ambulanceMers);

        process(mers, ambulanceMers, armoredMers, armoredAmbulanceMers);
    }

    /* client code that is able to work with a Car objects */
    private void process(Car... cars) {
        for(Car car : cars) {
            car.go();
        }
    }

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }
}
