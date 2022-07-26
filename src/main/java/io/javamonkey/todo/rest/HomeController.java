package io.javamonkey.todo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/api/hello")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

}