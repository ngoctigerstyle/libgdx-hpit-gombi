package com.vn.gombi.helper;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class SoundManager {

	private static float volumeSound = 1;
	
	public static boolean PLAY_MUSIC = true;
	public static boolean PLAY_SOUND = true;
	
	private Sound soundSelect, soundEat, soundBoom;
	private static ArrayList<Sound> arraySound;
	
	public static int SOUND_SELECT = 0;
	public static int SOUND_EAT = 1;
	public static int SOUND_BOOM = 2;
	
	private Music mMenu, mPlay;
	private static ArrayList<Music> arrayMusic;
	public static int MUSIC_MENU = 0;
	public static int MUSIC_PLAY = 1;
	
	public SoundManager() {
		super();
		initSound();
		initMusic();
	}
	
	private void initSound(){
		soundSelect = Gdx.audio.newSound(Gdx.files.internal("sound/sound-select.mp3"));
		soundEat = Gdx.audio.newSound(Gdx.files.internal("sound/sound-eat.mp3"));
		soundBoom = Gdx.audio.newSound(Gdx.files.internal("sound/sound-boom.mp3"));
		arraySound = new ArrayList<Sound>(3);
		arraySound.add(soundSelect);
		arraySound.add(soundEat);
		arraySound.add(soundBoom);
	}
	
	private void initMusic(){
		mMenu = Gdx.audio.newMusic(Gdx.files.internal("sound/menu.mp3"));
		mPlay = Gdx.audio.newMusic(Gdx.files.internal("sound/play.mp3"));
		arrayMusic = new ArrayList<Music>(2);
		arrayMusic.add(mMenu);
		arrayMusic.add(mPlay);
	}
	
	public static void playSound(int iSound){
		arraySound.get(iSound).play(volumeSound);
	}
	
	public static void playMusic(int iMusic){
		for (Music m : arrayMusic){
			m.stop();
//			m.dispose();
		}
		arrayMusic.get(iMusic).setLooping(true);
		arrayMusic.get(iMusic).play();
	}
	
	public static void setVolumeMusic(float v){
		for (int i = 0; i < arrayMusic.size() ; i++)
			arrayMusic.get(i).setVolume(v);
	}
	
	public static void setVolumeSound(float volume){
		volumeSound = volume;
	}
}