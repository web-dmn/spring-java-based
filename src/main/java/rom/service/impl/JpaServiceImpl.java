package rom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import rom.persistence.entity.UserEntity;
import rom.persistence.repository.UserRepository;
import rom.service.JpaService;

import java.util.List;

/**
 * Created by Java on 2017/03/21.
 */
public class JpaServiceImpl implements JpaService {

    @Autowired
    public UserRepository userRepository;

    public List<UserEntity> getData() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities;
    }
}
