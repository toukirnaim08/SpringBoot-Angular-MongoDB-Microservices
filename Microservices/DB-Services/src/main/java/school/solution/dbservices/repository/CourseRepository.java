package school.solution.dbservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import school.solution.dbservices.model.Course;

@Repository
public interface CourseRepository extends MongoRepository<Course,Integer> {
}
