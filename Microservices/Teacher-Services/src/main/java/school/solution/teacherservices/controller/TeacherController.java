package school.solution.teacherservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/teacher")
public class TeacherController {
	private String dbRoot = "http://DB-SERVICES/api/v1/db/";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/save")
	public String saveInstructor(){
		String Instructor = restTemplate.getForObject(dbRoot+"saveinstructor", String.class);
		return Instructor;
	}

	@GetMapping("/all")
	public String allInstructors(){
		String allInstructor = restTemplate.getForObject(dbRoot+"allinstructors", String.class);
		return allInstructor;
	}

}
