package school.solution.courseservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/course")
public class CourseController {

	private String dbRoot = "http://DB-SERVICES/api/v1/db/";
	private String serverDownMsg = "DB-Server down, please try again later";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CircuitBreakerFactory cbFactory;

	@GetMapping("/save")
	public String saveCourse(){
		return cbFactory.create("slow").run(() -> restTemplate.getForObject(dbRoot + "savecourse",
				String.class), throwable -> serverDownMsg);
	}

	@GetMapping("/all")
	public String allCourse(){
		return cbFactory.create("slow").run(() -> restTemplate.getForObject(dbRoot + "allcourses",
				String.class), throwable -> serverDownMsg);
	}
}
