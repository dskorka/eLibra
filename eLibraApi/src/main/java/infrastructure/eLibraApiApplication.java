package infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Damian on 27.07.2017
 */

@SpringBootApplication(scanBasePackages = "infrastructure")
public class eLibraApiApplication {

    public static void main(String... args){
        SpringApplication.run(eLibraApiApplication.class, args);
    }
}
