package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author czl
 * @date 2020-01-13 22:25
 * @since cloud2.0
 */

@Controller//把当前的类作为路由api的一个承载者
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}

