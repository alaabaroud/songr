package com.example.songr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    private int length;
    private String imageUrl;
    @Autowired
    AlbumRepo albumRepo;
    @GetMapping ("/album")
    public String getAlbum(Model model) {

        model.addAttribute("album", albumRepo.findAll());
//        AlbumModel albumA = new AlbumModel("Queen II", "Queen", 5,40,"https://upload.wikimedia.org/wikipedia/en/thumb/4/43/Queen_II_%28album_cover%29.jpg/220px-Queen_II_%28album_cover%29.jpg");
//        AlbumModel albumb = new AlbumModel("Bad", "Michael Jackson", 5,40,"https://upload.wikimedia.org/wikipedia/en/5/51/Michael_Jackson_-_Bad.png");
//        AlbumModel albumc = new AlbumModel("Divide", "Ed sheran", 5,40,"https://img.discogs.com/u3e2tWPxqlJjJ8ymLHYGl94y44w=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-9920546-1488569067-1787.jpeg.jpg");
//
//
//        List<AlbumModel> albumzz = new ArrayList<>();
//        albumzz.add(albumA);
//        albumzz.add(albumb);
//        albumzz.add(albumc);
//        model.addAttribute("albumzz", albumzz);

        return "album"
;
    }
    @PostMapping("/addAlbum")
    public RedirectView addFormData (@ModelAttribute AlbumModel albums , Model model){
        model.addAttribute("albums" , albums);
        albumRepo.save(albums);
        return new RedirectView("/albums");
    }

}
