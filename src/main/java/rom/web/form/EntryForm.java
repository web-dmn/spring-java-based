package rom.web.form;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by Java on 2017/03/22.
 */
@Data
@Component
public class EntryForm {
    private String name;
    private String kana;
    private String email;
}
