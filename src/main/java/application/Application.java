package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "true");
        System.setProperty("spring.devtools.livereload.enabled", "true");
        SpringApplication.run(Application.class, args);
    }
}