package com.example.songr;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {

    @GetMapping ("/songs")
    public String songs (Model model) {
        model.addAttribute("song", SongRepo.findAll());
   return "songs";
    }
}
