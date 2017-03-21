package rom.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rom.persistence.entity.UserEntity;

/**
 * Created by Java on 2017/03/16.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
