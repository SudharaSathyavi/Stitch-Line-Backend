package lk.stichline.stitchline.repo;

import lk.stichline.stitchline.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
    User findByUsername(String username);
}
