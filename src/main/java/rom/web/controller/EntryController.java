package rom.web.controller;

import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rom.persistence.entity.UserInfEntity;
import rom.persistence.repository.UserInfRepository;
import rom.persistence.repository.UserRepository;
import rom.web.form.EntryForm;

/**
 * Created by Java on 2017/03/22.
 */
@Controller
public class EntryController {

    @Autowired
    public EntryForm entryForm;

    @Autowired
    public UserInfRepository userInfRepository;

    // EntryPageへ遷移
    @RequestMapping(value = "/entry", method = RequestMethod.GET)
    public String newlyEntry(Model model) {
        model.addAttribute("entryForm", entryForm);
        return "newlyentry";
    }

    // 「戻る」ボタン押下時
    @RequestMapping(value = "/entry", params = "back", method = RequestMethod.POST)
    public String back() {
        return "index";
    }

    // 「確認」ボタン押下時
    @RequestMapping(value = "/entry", params = "conf",produces = "text/plain;charset=UTF-8", method = RequestMethod.POST)
    public String conf(Model model, @ModelAttribute("entryForm") EntryForm entryForm) {
        model.addAttribute("name", entryForm.getName());
        model.addAttribute("kana", entryForm.getKana());
        model.addAttribute("email", entryForm.getEmail());
        return "conf";
    }

    // 「登録」ボタン押下時
    @RequestMapping(value = "/entry", params = "comp", method = RequestMethod.POST)
    public String comp(Model model, @ModelAttribute("entryForm") EntryForm entryForm) {
        UserInfEntity userInfEntity = new UserInfEntity();
        userInfEntity.setName(entryForm.getName());
        userInfEntity.setKana(entryForm.getKana());
        userInfEntity.setEmail(entryForm.getEmail());
        userInfRepository.save(userInfEntity);
        return "index";
    }
}
