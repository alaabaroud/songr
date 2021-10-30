package com.example.songr;

import org.springframework.data.repository.CrudRepository;
import com.example.songr.SongModel;
public interface SongRepo extends CrudRepository<SongModel, Integer> {
}
