package jp.or.venuspj.studio.web.studio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * トップページ用コントローラー.
 */
@Controller
public class IndexController {
    @RequestMapping(path = "*")
    public String index(Model model) {
        return "index";
    }

}
