package school.solution.dbservices.service;

import school.solution.dbservices.dto.InstructorDto;
import school.solution.dbservices.model.Instructor;

import java.util.List;

public interface InstructorService {
	Instructor save(InstructorDto instructorDto);
	List<Instructor> allInstructor();
}
