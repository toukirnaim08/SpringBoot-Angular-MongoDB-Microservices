package school.solution.controlserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ControlServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlServerApplication.class, args);
	}

}
