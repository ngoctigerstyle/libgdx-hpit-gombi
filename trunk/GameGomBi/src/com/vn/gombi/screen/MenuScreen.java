package com.vn.gombi.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.helper.SoundManager;

public class MenuScreen extends BaseScreen {

	private Image imgBack;

	@Override
	public void show() {
		super.show();
		imgBack = new Image(new TextureRegion(GameControl.getAtlas()
				.findRegion("menu/background")));
		stage.addActor(imgBack);

		Image menuBall = new Image(new TextureRegion(GameControl.getAtlas()
				.findRegion("menu/ball-text")));
		menuBall.setX(200);
		menuBall.setY(270);
		stage.addActor(menuBall);

		TextButton tnewGame = new TextButton("New game", GameControl.getMySkin());
		tnewGame.setX(280);
		tnewGame.setY(180);
		tnewGame.setWidth(200);
		tnewGame.setHeight(70);
		stage.addActor(tnewGame);

		TextButton tquitGame = new TextButton("Quit game", GameControl.getMySkin());
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
				SoundManager.playSound(SoundManager.SOUND_SELECT);
				GameControl.getManagerScreen().createScreen(
						ManagerScreen.SCREEN_PLAY);
			}
		});

		tquitGame.addListener(new ClickListener() {

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
				SoundManager.playSound(SoundManager.SOUND_SELECT);
				Gdx.app.exit();
			}

		});
		
//		GameControl.getSoundManager().playSound(SoundManager.SOUND_1);
	}

	@Override
	public void render(float arg0) {
		super.render(arg0);
		// imgBack.setX(imgBack.getX()+5);
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
