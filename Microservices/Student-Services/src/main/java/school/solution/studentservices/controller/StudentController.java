package school.solution.studentservices.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import school.solution.studentservices.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

	private String dbRoot = "http://DB-SERVICES/api/v1/db/";
	private String serverDownMsg = "DB-Server down, please try again later";
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CircuitBreakerFactory cbFactory;

	@GetMapping("/save")
	public String saveStudent(){
		return cbFactory.create("slow").run(() -> restTemplate.getForObject(dbRoot + "savestudent",
				String.class), throwable -> serverDownMsg);
	}

	@GetMapping("/all")
	public String allStudent(){
		return cbFactory.create("slow").run(() -> restTemplate.getForObject(dbRoot + "allstudents",
				String.class), throwable -> serverDownMsg);
	}
}
