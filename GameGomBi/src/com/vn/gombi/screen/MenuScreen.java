package com.vn.gombi.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.vn.gombi.constant.Constant;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.helper.MyInput;
import com.vn.gombi.helper.SoundManager;

public class MenuScreen extends BaseScreen {

	private Image imgBack;
	private TextButton tnewGame, tquitGame, tbTouch, tbAccelerometer;

	@Override
	public void show() {
		super.show();
//		resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		imgBack = new Image(new TextureRegion(GameControl.getAtlas()
				.findRegion("menu/background")));
		stage.addActor(imgBack);

		Image menuBall = new Image(new TextureRegion(GameControl.getAtlas()
				.findRegion("menu/ball-text")));
		menuBall.setX(200);
		menuBall.setY(270);
		stage.addActor(menuBall);

		initTextButton();
		initTextButtonInvi();
		
//		GameControl.getSoundManager().playSound(SoundManager.SOUND_1);
		SoundManager.playMusic(SoundManager.MUSIC_MENU);
	}
	
	private void initTextButtonInvi() {
		tbTouch = new TextButton("Touch", GameControl.getMySkin());
		tbTouch.setX(tnewGame.getX() - tnewGame.getWidth()/2 - 5);
		tbTouch.setY(tnewGame.getY());
		tbTouch.setWidth(tnewGame.getWidth());
		tbTouch.setHeight(tnewGame.getHeight());
		tbTouch.setVisible(false);
		stage.addActor(tbTouch);
		tbTouch.addListener(new ClickListener(){

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
				if (MyInput.wrapButton(tbTouch)){
					SoundManager.playSound(SoundManager.SOUND_SELECT);
					Constant.GAME_STYLE = Constant.TOUCH;
					GameControl.getManagerScreen().createScreen(ManagerScreen.SCREEN_PLAY);
				}
			}
		});
		
		tbAccelerometer = new TextButton("Accelerometer", GameControl.getMySkin());
		tbAccelerometer.setX(tnewGame.getX() + tnewGame.getWidth() / 2 + 5);
		tbAccelerometer.setY(tnewGame.getY());
		tbAccelerometer.setWidth(tnewGame.getWidth());
		tbAccelerometer.setHeight(tnewGame.getHeight());
		tbAccelerometer.setVisible(false);
		stage.addActor(tbAccelerometer);
		tbAccelerometer.addListener(new ClickListener(){

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
				if (MyInput.wrapButton(tbAccelerometer)){
					SoundManager.playSound(SoundManager.SOUND_SELECT);
					Constant.GAME_STYLE = Constant.ACCELEROMETER;
					GameControl.getManagerScreen().createScreen(ManagerScreen.SCREEN_PLAY);
				}
			}
		});
	}

	private void initTextButton(){
		tnewGame = new TextButton("New game", GameControl.getMySkin());
		tnewGame.setX(280);
		tnewGame.setY(180);
		tnewGame.setWidth(200);
		tnewGame.setHeight(70);
		stage.addActor(tnewGame);

		tquitGame = new TextButton("Quit game", GameControl.getMySkin());
		tquitGame.setX(280);
		tquitGame.setY(100);
		tquitGame.setWidth(200);
		tquitGame.setHeight(70);
		stage.addActor(tquitGame);

		tnewGame.addListener(new ClickListener() {

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
				if(MyInput.wrapButton(tnewGame)){
					SoundManager.playSound(SoundManager.SOUND_SELECT);
					tnewGame.setVisible(false);
					tbTouch.setVisible(true);
					tbAccelerometer.setVisible(true);
				}
			}
		});

		tquitGame.addListener(new ClickListener() {

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
				if (MyInput.wrapButton(tquitGame)){
					SoundManager.playSound(SoundManager.SOUND_SELECT);
					Gdx.app.exit();
				}
			}
		});
	}

	@Override
	public void render(float arg0) {
		super.render(arg0);
		// imgBack.setX(imgBack.getX()+5);
//		if (tnewGame.isOver())
//			Gdx.app.log("sdf", "sdfs");
//		Actor a = stage.hit(Gdx.input.getX(), Gdx.input.getY(), false);
//		if (a != null)
//			Gdx.app.log("sdf", a.toString());
	}

	@Override
	public void hide() {
		super.hide();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resize(int arg0, int arg1) {
		super.resize(arg0, arg1);
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

}
