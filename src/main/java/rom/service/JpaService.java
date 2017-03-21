package rom.service;

import org.springframework.stereotype.Service;
import rom.persistence.entity.UserEntity;

import java.util.List;

/**
 * Created by Java on 2017/03/21.
 */
@Service
public interface JpaService {
    public List<UserEntity> getData();
}
