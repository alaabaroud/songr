package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {


		AlbumModel test = new AlbumModel("test", "test", 10 , 20, "https://img.discogs.com/u3e2tWPxqlJjJ8ymLHYGl94y44w=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-9920546-1488569067-1787.jpeg.jpg");
	}

}
