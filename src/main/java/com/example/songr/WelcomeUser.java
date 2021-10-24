package com.example.songr;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeUser {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    @GetMapping("/welcome/{name}")
    @ResponseBody
    public String welcome (@PathVariable String name) {

        return "welcome";
    }

}
