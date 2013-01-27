package com.vn.gombi.helper;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.vn.gombi.gamelogic.GameControl;

public class SoundMusic extends Group{

	private Image sound, music, lockSound, lockMusic;;
	public SoundMusic() {
		super();
		sound = new Image(GameControl.getAtlas().findRegion("menu/sound"));
		music = new Image(GameControl.getAtlas().findRegion("menu/music"));
		music.setX(80);
		
		lockSound = new Image(GameControl.getAtlas().findRegion("menu/x-red"));
		if (SoundManager.PLAY_SOUND == true)
			lockSound.setVisible(false);
		lockSound.setTouchable(Touchable.disabled);
		
		lockMusic = new Image(GameControl.getAtlas().findRegion("menu/x-red"));
		lockMusic.setX(80);
		if (SoundManager.PLAY_MUSIC == true)
			lockMusic.setVisible(false);
		lockMusic.setTouchable(Touchable.disabled);
		
		this.addActor(sound);
		this.addActor(lockSound);
		this.addActor(music);
		this.addActor(lockMusic);
		initClick();
	}
	
	public void setVertical(){
		sound.setY(80);
		lockSound.setY(80);
		music.setX(0);
		lockMusic.setX(0);
	}
	
	private void initClick() {
		sound.addListener(new ClickListener(){

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
				if (MyInput.wrapButton(sound))
					if (SoundManager.PLAY_SOUND == true){
						SoundManager.setVolumeSound(0);
						SoundManager.PLAY_SOUND  = false;
						lockSound.setVisible(true);
					}else{
						SoundManager.setVolumeSound(1);
						SoundManager.PLAY_SOUND  = true;
						lockSound.setVisible(false);
					}
			}
		});
		
		music.addListener(new ClickListener(){

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
				if (MyInput.wrapButton(music))
					if (SoundManager.PLAY_MUSIC == true){
						SoundManager.setVolumeMusic(0);
						SoundManager.PLAY_MUSIC = false;
						lockMusic.setVisible(true);
					}else {
						SoundManager.setVolumeMusic(1);
						SoundManager.PLAY_MUSIC = true;
						lockMusic.setVisible(false);
					}
			}
		});
	}
}
