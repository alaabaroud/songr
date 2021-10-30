package com.example.songr;

import org.springframework.data.repository.CrudRepository;
import com.example.songr.AlbumModel;



public interface AlbumRepo extends CrudRepository<AlbumModel, Integer> {


}

