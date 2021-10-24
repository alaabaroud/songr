package com.example.songr;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;


@Controller
//@RequestMapping("/homeController")

public class homeController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)

//    @ResponseBody
//    @GetMapping
    public String test() {
//        return  "testing";
        return "home";
    }
 //  localhost:8080/homeController/getMapping
    @GetMapping("/getMapping")
//    @ResponseBody
    public String getMapping(){
        return "hello World";
    }


// localhost:8080/homeController/test
}
