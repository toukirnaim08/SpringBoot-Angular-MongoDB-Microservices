package school.solution.dbservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.solution.dbservices.dto.StudentDto;
import school.solution.dbservices.model.Student;
import school.solution.dbservices.service.StudentService;

@RestController
@RequestMapping("api/v1/db")
public class DBApiController {

	private StudentService studentService;

	public DBApiController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/test")
	public String testString()
	{
		return "testing";
	}

	@GetMapping("/save")
	public String saveStudent()
	{
		StudentDto studentDto = new StudentDto("temo", 20, "tt@gh.vom");
		Student student= this.studentService.save(studentDto);
		return student.toString();
	}

	@GetMapping("/all")
	public String getAllStudent()
	{

		return this.studentService.allStudent().toString();
	}

}
