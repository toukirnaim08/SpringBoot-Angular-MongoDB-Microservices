package school.solution.dbservices.service;

import school.solution.dbservices.dto.StudentDto;
import school.solution.dbservices.model.Student;

import java.util.List;


public interface StudentService {
	Student save(StudentDto studentDto);
	List<Student> allStudent();
}
