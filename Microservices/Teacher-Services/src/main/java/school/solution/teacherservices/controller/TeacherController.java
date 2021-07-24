package school.solution.teacherservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@GetMapping("/all")
	public String test(){
		return "teacherAPI";
	}

}
