package school.solution.dbservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import school.solution.dbservices.model.Instructor;

@Repository
public interface InstructorRepository extends MongoRepository<Instructor,Integer> {
}
