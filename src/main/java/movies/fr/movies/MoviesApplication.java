package movies.fr.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import movies.fr.movies.conf.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"movies.fr.movies"})
public class MoviesApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(MoviesApplication.class, args);
    }
}