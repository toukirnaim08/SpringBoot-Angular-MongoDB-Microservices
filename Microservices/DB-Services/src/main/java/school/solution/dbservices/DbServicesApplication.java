package school.solution.dbservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DbServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbServicesApplication.class, args);
	}

}
