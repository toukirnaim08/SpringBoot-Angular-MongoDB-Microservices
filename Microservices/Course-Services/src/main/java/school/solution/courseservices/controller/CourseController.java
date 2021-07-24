package school.solution.courseservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/all")
	public String test(){
		return "courseAPI";
	}

	@GetMapping("/testl")
	public String test1(){

		String teacherTemp = restTemplate.getForObject("http://TEACHER-SERVICES/teacher/all", String.class);
		return teacherTemp;
	}

	@GetMapping("/test2")
	public String test2(){

		String teacherTemp = restTemplate.getForObject("http://DB-SERVICES/api/v1/db/savestudent", String.class);
		return teacherTemp;
	}

	@GetMapping("/test3")
	public List<Student> test3(){

		Student[] students = restTemplate.getForObject("http://DB-SERVICES/api/v1/db/allstudents", Student[].class);
		return Arrays.asList(students);
	}
}
