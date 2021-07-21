package school.solution.dbservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import school.solution.dbservices.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer> {
}
