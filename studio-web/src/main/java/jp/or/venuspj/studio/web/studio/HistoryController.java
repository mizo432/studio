package jp.or.venuspj.studio.web.studio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * リンクページ用コントローラー.
 */
@Controller
public class HistoryController {
    @RequestMapping(path = "/history")
    public String index(Model model) {
        return "history";
    }

}
