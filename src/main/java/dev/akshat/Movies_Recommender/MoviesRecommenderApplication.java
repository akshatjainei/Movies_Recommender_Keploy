package dev.akshat.Movies_Recommender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesRecommenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesRecommenderApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot(){
		return "Test_Run";
	}
}
