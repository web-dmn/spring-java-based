package rom.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Java on 2017/03/30.
 */
@Data
@Entity
@Table(name = "USER_INF")
public class UserInfEntity {

    @Id
    @Column(name = "name")
    private String name;
    private String kana;
    private String email;
}
