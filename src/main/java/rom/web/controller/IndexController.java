package rom.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rom.persistence.config.JpaConfig;
import rom.persistence.entity.UserEntity;
import rom.persistence.repository.UserRepository;
import rom.service.JpaService;

import java.util.List;
import java.util.Map;

/**
 * CREATED BY JAVA ON 2017/03/15.
 */
@Controller
public class IndexController {

    @Autowired
    public UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("msg", "HelloWorld");
        return mav;
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ModelAndView getDate() {
        ModelAndView mav = new ModelAndView("index");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM USER_INF");
        mav.addObject("jdbc", list);
        return mav;
    }

    @RequestMapping(value = "/jpa", method = RequestMethod.GET)
    public ModelAndView jpaData() {
        ModelAndView mav = new ModelAndView("index");

        List<UserEntity> list = userRepository.findAll();
        String name = list.get(0).getUser_name();
        mav.addObject("jpa", name);
        return mav;
    }
}
