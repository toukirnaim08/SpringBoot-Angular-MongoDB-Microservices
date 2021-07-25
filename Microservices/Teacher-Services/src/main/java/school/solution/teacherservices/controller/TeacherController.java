package school.solution.teacherservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/teacher")
public class TeacherController {
	private String dbRoot = "http://DB-SERVICES/api/v1/db/";
	private String serverDownMsg = "DB-Server down, please try again later";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CircuitBreakerFactory cbFactory;

	@GetMapping("/save")
	public String saveInstructor(){
		return cbFactory.create("slow").run(() -> restTemplate.getForObject(dbRoot + "saveinstructor",
				String.class), throwable -> serverDownMsg);
	}

	@GetMapping("/all")
	public String allInstructors(){
		return cbFactory.create("slow").run(() -> restTemplate.getForObject(dbRoot + "allinstructors",
				String.class), throwable -> serverDownMsg);
	}

}
