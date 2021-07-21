package school.solution.dbservices.service;

import org.springframework.stereotype.Service;
import school.solution.dbservices.dto.StudentDto;
import school.solution.dbservices.model.Student;
import school.solution.dbservices.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;

	private int counter = 1;
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student save(StudentDto studentDto) {
		counter++;
		Student student = new Student(counter,studentDto.getName(),studentDto.getAge(),studentDto.getEmail());
		return this.studentRepository.save(student);
	}

	@Override
	public List<Student> allStudent() {
		return this.studentRepository.findAll();
	}
}
