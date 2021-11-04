package com.example.songr;
import com.example.songr.AlbumModel;
import org.springframework.data.repository.CrudRepository;
public interface AlbumRepo  extends CrudRepository<AlbumModel,Integer> {
}
