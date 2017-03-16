package rom.persistence.repository.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import rom.persistence.repository.UserRepository;

/**
 * Created by Java on 2017/03/16.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getUserName(int id) {
        String sql = "SELECT * FROM USER_INF WHERE ID = ?";
        String name = jdbcTemplate.queryForObject(sql, new Object[]{id},String .class);
        return name;
    }
}
