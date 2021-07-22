package school.solution.dbservices.service;

import org.springframework.stereotype.Service;
import school.solution.dbservices.dto.InstructorDto;
import school.solution.dbservices.model.Instructor;
import school.solution.dbservices.repository.InstructorRepository;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService{

	private InstructorRepository instructorRepository;
	int counter;

	public InstructorServiceImpl(InstructorRepository instructorRepository) {
		this.instructorRepository = instructorRepository;
	}

	@Override
	public Instructor save(InstructorDto instructorDto) {
		counter++;
		Instructor instructor = new Instructor(counter, instructorDto.getName(),instructorDto.getEmail());
		return this.instructorRepository.save(instructor);
	}

	@Override
	public List<Instructor> allInstructor() {
		return this.instructorRepository.findAll();
	}
}
