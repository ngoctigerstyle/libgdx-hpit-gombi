package com.vn.gombi.helper;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class SoundManager {

	private Sound soundSelect, soundEat, soundBoom;
	private static ArrayList<Sound> arraySound;
	
	public static int SOUND_SELECT = 0;
	public static int SOUND_EAT = 1;
	public static int SOUND_BOOM = 2;
	
	public SoundManager() {
		super();
		soundSelect = Gdx.audio.newSound(Gdx.files.internal("sound/sound-select.mp3"));
		soundEat = Gdx.audio.newSound(Gdx.files.internal("sound/sound-eat.mp3"));
		soundBoom = Gdx.audio.newSound(Gdx.files.internal("sound/sound-boom.mp3"));
		arraySound = new ArrayList<Sound>(3);
		arraySound.add(soundSelect);
		arraySound.add(soundEat);
		arraySound.add(soundBoom);
	}
	
	public static void playSound(int iSound){
		arraySound.get(iSound).play(1.0f);
	}
}