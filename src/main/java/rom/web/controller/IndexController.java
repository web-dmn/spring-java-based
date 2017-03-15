package rom.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Java on 2017/03/15.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("msg", "HelloWorld");
        return mav;
    }
}
