package com.example.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepo songRepo;
    AlbumRepo albumRepo;


    @GetMapping ("/songs")
    public String songs (Model model) {
        model.addAttribute("song", songRepo.findAll());
   return "songs";
    }

    @GetMapping("/albums/{Id}")
    public String getSongs (@PathVariable("id")int id, Model model){

        model.addAttribute("albums", albumRepo.findById(id).get());
        return ("oneAlbum");
    }


    @PostMapping("/addSong/{id}")
    public RedirectView addSong(@ModelAttribute SongModel songModel , @PathVariable("id") int id){
        songModel.setAlbums(albumRepo.findById(id).get());
        songRepo.save(songModel);
        return new RedirectView("/albums/{id}");
    }

}
