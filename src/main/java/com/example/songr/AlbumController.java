package com.example.songr;
import com.example.songr.AlbumModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
//    private int length;
//    private String imageUrl;
    @GetMapping ("/album")
    public String getAlbum(Model model) {
        AlbumModel albumA = new AlbumModel("Queen II", "Queen", 5,40,"https://upload.wikimedia.org/wikipedia/en/thumb/4/43/Queen_II_%28album_cover%29.jpg/220px-Queen_II_%28album_cover%29.jpg");
        AlbumModel albumb = new AlbumModel("Queen II", "Queen", 5,40,"https://upload.wikimedia.org/wikipedia/en/thumb/4/43/Queen_II_%28album_cover%29.jpg/220px-Queen_II_%28album_cover%29.jpg");
        AlbumModel albumc = new AlbumModel("Queen II", "Queen", 5,40,"https://upload.wikimedia.org/wikipedia/en/thumb/4/43/Queen_II_%28album_cover%29.jpg/220px-Queen_II_%28album_cover%29.jpg");


        List<AlbumModel> albumzz = new ArrayList<>();
        albumzz.add(albumA);
        albumzz.add(albumb);
        albumzz.add(albumc);
        model.addAttribute("albumzz", albumzz);

        return "album"
;
    }
}
