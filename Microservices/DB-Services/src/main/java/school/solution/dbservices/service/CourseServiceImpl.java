package school.solution.dbservices.service;

import org.springframework.stereotype.Service;
import school.solution.dbservices.dto.CourseDto;
import school.solution.dbservices.model.Course;
import school.solution.dbservices.model.Student;
import school.solution.dbservices.repository.CourseRepository;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

	private CourseRepository courseRepository;
	int counter;

	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public Course save(CourseDto courseDto) {
		counter++;
		Course course = new Course(counter,courseDto.getTitle(),courseDto.getCourseCode());
		return this.courseRepository.save(course);
	}

	@Override
	public List<Course> allCourse() {
		return this.courseRepository.findAll();
	}
}
