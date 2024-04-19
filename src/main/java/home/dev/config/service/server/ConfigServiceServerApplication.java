package home.dev.config.service.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories(basePackages = "home.dev.config.service.server.repository.mongo")
//@EnableJpaRepositories(basePackages = "home.dev.config.service.server.repository.postgres")
public class ConfigServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceServerApplication.class, args);
	}

}
