package com.learn.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

	private String title = "Pepper's band";
	private String artist = "The Beatles";
	
	public void play() {
		System.out.println("Playing: " + title + " & Artist: " + artist);
	}
}
