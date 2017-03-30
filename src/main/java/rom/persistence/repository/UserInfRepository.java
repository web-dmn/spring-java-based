package rom.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rom.persistence.entity.UserInfEntity;

/**
 * Created by Java on 2017/03/30.
 */
@Repository
public interface UserInfRepository extends JpaRepository<UserInfEntity, String> {
}
