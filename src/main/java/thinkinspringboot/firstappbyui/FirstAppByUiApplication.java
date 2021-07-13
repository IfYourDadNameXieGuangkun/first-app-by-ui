package thinkinspringboot.firstappbyui;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class FirstAppByUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppByUiApplication.class, args);
	}

}
