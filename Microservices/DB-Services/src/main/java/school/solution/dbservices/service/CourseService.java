package school.solution.dbservices.service;

import school.solution.dbservices.dto.CourseDto;
import school.solution.dbservices.model.Course;

import java.util.List;

public interface CourseService {
	Course save(CourseDto courseDto);
	List<Course> allCourse();
}
