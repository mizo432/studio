package org.venuspj.studio.web.studio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * トップページ用コントローラー.
 */
@Controller
public class NewsController {
    @RequestMapping(path = "/news")
    public String index(Model model) {
        return "news";
    }

}
