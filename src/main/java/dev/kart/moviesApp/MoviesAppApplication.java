package dev.kart.moviesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesAppApplication.class, args);
	}
}
