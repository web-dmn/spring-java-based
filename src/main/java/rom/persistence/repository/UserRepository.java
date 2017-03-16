package rom.persistence.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by Java on 2017/03/16.
 */
public interface UserRepository {
    public String getUserName(int id);
}
