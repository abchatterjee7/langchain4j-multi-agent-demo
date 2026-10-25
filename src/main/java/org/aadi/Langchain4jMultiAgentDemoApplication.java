package org.aadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class Langchain4jMultiAgentDemoApplication {

    static {
        Dotenv.configure()
                .ignoreIfMissing()
                .load()
                .entries()
                .forEach(e -> System.setProperty(e.getKey(), e.getValue()));
    }

	public static void main(String[] args) {
		SpringApplication.run(Langchain4jMultiAgentDemoApplication.class, args);
	}

}
