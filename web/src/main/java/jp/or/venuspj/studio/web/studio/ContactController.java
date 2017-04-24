package jp.or.venuspj.studio.web.studio;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ContactController {
    @RequestMapping(path = "/contact")
    public String index(Model model) {
        return "contact";
    }
}
