package school.solution.dbservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import school.solution.dbservices.model.Notice;

@Repository
public interface NoticeRepository extends MongoRepository<Notice,Integer> {
}
