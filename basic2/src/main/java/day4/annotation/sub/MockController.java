package day4.annotation.sub;

import day4.annotation.sub.annotation.Controller;
import day4.annotation.sub.annotation.GetMapping;

@Controller
public class MockController {
    @GetMapping(path = "/")
    public String index() {
        return "index";
    }

}
