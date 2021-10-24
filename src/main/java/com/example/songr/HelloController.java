package com.example.songr;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
public class HelloController {
   // localhost:8080/HelloWorld
    @GetMapping("/hello")
    @ResponseBody
    public String getHelloWorld(){
        return "Hello World";
    }

@GetMapping ("/")
public String UpperCase(){
        return "home";
}

@GetMapping("/UpperCase/{name}")

public  String UpperCase(@PathVariable String name, Model model){
        name= name.toUpperCase(Locale.ROOT);
        model.addAttribute("name", name);

        return "home";
}

//
//        @GetMapping("/welcome/{name}")
//        @ResponseBody
//        public String welcome(@PathVariable String name) {
//
//            return "home";
//        }

}
