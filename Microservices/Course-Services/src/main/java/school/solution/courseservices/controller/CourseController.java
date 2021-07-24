package school.solution.courseservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/save")
	public String saveCourse(){
		String course = restTemplate.getForObject(dbRoot+"savecourse", String.class);
		return course;
	}

	@GetMapping("/all")
	public String allCourse(){
		String allCourses = restTemplate.getForObject(dbRoot+"allcourses", String.class);
		return allCourses;
	}
}
