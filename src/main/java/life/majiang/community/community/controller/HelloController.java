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

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name")String name , Model model){//@RequestParam请求参数
        model.addAttribute("name",name);
        return "hello";
    }
}
