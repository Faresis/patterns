package core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import builders.*;
import operations.*;
import domain.*;
import java.util.Map;
import java.util.HashMap;
import java.io.Console;

@SpringBootApplication
class Application implements CommandLineRunner {

     public static void main(String args[]) {
         SpringApplication.run(Application.class);
     }

     @Override
     public void run(String... strings) throws Exception {
         Map<String, LaptopBuilder> builders = new HashMap<>();
         builders.put("trip", new TripLaptopBuilder());
         builders.put("games", new GamingLaptopBuilder());

         Console console = System.console();
         String key = console.readLine("What kind of laptop are you expecting to have?");

         if(builders.containsKey(key)) {
             BuyLaptop shop = new BuyLaptop();
             shop.setLaptopBuilder(builders.get(key));
             shop.constructLaptop();
             Laptop laptop = shop.getMyLaptop();
             System.out.println(laptop);
         } else {
             System.out.println("Sorry. We can't afford you that.");
         }
     }
}
