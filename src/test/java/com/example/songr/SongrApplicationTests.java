package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {


	
		AlbumModel test = new AlbumModel("test", "test", 10 , 20, "https://img.discogs.com/u3e2tWPxqlJjJ8ymLHYGl94y44w=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-9920546-1488569067-1787.jpeg.jpg");
	assertTrue(test instanceof AlbumModel);

	test.setArtist("alaa");
	assertEquals("alaa", test.getArtist());

	test.setImageUrl("https://img.discogs.com/u3e2tWPxqlJjJ8ymLHYGl94y44w=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-9920546-1488569067-1787.jpeg.jpg");
	assertEquals("https://img.discogs.com/u3e2tWPxqlJjJ8ymLHYGl94y44w=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-9920546-1488569067-1787.jpeg.jpg", test.getImageUrl());

	test.setTitle("alaa");
	assertEquals("alaa", test.getTitle());


	test.setSongCount(5);
	assertEquals(5, test.getSongCount());

	test.setLength(50);
	assertEquals(50, test.getLength());




	}


}
