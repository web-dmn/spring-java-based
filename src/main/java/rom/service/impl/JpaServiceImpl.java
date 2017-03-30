package rom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import rom.persistence.entity.UserEntity;
import rom.persistence.repository.UserRepository;
import rom.service.JpaService;

import java.util.List;

/**
 * Userテーブルに対する処理
 * Created by Java on 2017/03/21.
 */
public class JpaServiceImpl implements JpaService {

    @Autowired
    public UserRepository userRepository;

    // UserData取得メソッド
    public List<UserEntity> getData() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities;
    }

}
