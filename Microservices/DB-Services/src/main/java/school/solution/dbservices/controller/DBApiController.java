package school.solution.dbservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.solution.dbservices.dto.CourseDto;
import school.solution.dbservices.dto.InstructorDto;
import school.solution.dbservices.dto.NoticeDto;
import school.solution.dbservices.dto.StudentDto;
import school.solution.dbservices.model.Course;
import school.solution.dbservices.model.Instructor;
import school.solution.dbservices.model.Notice;
import school.solution.dbservices.model.Student;
import school.solution.dbservices.service.CourseService;
import school.solution.dbservices.service.InstructorService;
import school.solution.dbservices.service.NoticeService;
import school.solution.dbservices.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("api/v1/db")
public class DBApiController {

	private StudentService studentService;
	private CourseService courseService;
	private NoticeService noticeService;
	private InstructorService instructorService;

	public DBApiController(StudentService studentService, CourseService courseServic,
						   NoticeService noticeService,InstructorService instructorService) {
		this.studentService = studentService;
		this.courseService = courseServic;
		this.noticeService = noticeService;
		this.instructorService = instructorService;
	}

	@GetMapping("/test")
	public String testString()
	{
		return "testing";
	}

	@GetMapping("/savestudent")
	public String saveStudent()
	{
		StudentDto studentDto = new StudentDto("temo", 20, "tt@gh.vom");
		Student student= this.studentService.save(studentDto);
		return student.toString();
	}

	@GetMapping("/allstudents")
	public List<Student> getAllStudent()
	{
		return this.studentService.allStudent();
	}

	@GetMapping("/savecourse")
	public String saveCourse()
	{
		CourseDto courseDto = new CourseDto("title1", "101");
		Course course= this.courseService.save(courseDto);
		return course.toString();
	}

	@GetMapping("/allcourses")
	public String getAllCourse()
	{
		return this.courseService.allCourse().toString();
	}

	@GetMapping("/savenotice")
	public String saveNotice()
	{
		NoticeDto noticeDto = new NoticeDto("1/11/2020","10/11/2021","title1","description1");
		Notice notice= this.noticeService.save(noticeDto);
		return notice.toString();
	}

	@GetMapping("/allnotices")
	public String getAllNotice()
	{
		return this.noticeService.allNotice().toString();
	}

	@GetMapping("/saveinstructor")
	public String saveInstructor()
	{
		InstructorDto instructorDto = new InstructorDto("temp2","ins@gmail.com");
		Instructor instructor= this.instructorService.save(instructorDto);
		return instructor.toString();
	}

	@GetMapping("/allinstructors")
	public String getAllInstructor()
	{
		return this.instructorService.allInstructor().toString();
	}

}
