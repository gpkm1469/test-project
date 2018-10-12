package com.learn.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule();
	
	@Autowired
	private MediaPlayer player;

	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull()
	{
		assertNotNull(cd);
	}
	
	@Test
	public void play() {
		player.play();
		assertEquals("Playing: " + "Pepper's band" + " & Artist: " + "The Beatles", log.getLog());
	}
}
