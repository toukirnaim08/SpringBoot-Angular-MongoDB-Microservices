package school.solution.studentservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import school.solution.studentservices.model.Student;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

	private String dbRoot = "http://DB-SERVICES/api/v1/db/";
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/save")
	public String saveStudent(){
		String stringTemp = restTemplate.getForObject(dbRoot + "savestudent",String.class);
		return stringTemp;
	}

	@GetMapping("/all")
	public List<Student> allStudent(){
		Student[] students = restTemplate.getForObject(dbRoot + "allstudents",Student[].class);
		return Arrays.asList(students);
	}

}
