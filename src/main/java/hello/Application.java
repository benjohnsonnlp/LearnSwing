package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CharacterRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of characters
        repository.save(new Character("Adam"));
        repository.save(new Character("Ben"));

        // fetch all characters
        System.out.println("Characters found with findAll():");
        System.out.println("-------------------------------");
        for (Character character : repository.findAll()) {
            System.out.println(character);
        }
        System.out.println();


        System.out.println("Characters found with findByName(\"Adam\"):");
        System.out.println("--------------------------------");
        for (Character character : repository.findByName("Adam")) {
            System.out.println(character);
        }

    }

}