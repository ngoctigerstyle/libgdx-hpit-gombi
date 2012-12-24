package com.vn.libgdx.gombi.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class MenuScreen extends BaseScreen{

	@Override
	public void show() {
		super.show();
		Image menuBall = new Image(new TextureRegion(GameControl.getAtlas().findRegion("menu/ball-text")));
		menuBall.setX(200);
		menuBall.setY(270);
		stage.addActor(menuBall);
		
		TextButton tB1 = new TextButton("New game", GameControl.getMySkin());
		tB1.setX(280);
		tB1.setY(180);
		tB1.setWidth(200);
		tB1.setHeight(70);
		stage.addActor(tB1);
		
		TextButton tB2 = new TextButton("Quit game", GameControl.getMySkin());
		tB2.setX(280);
		tB2.setY(100);
		tB2.setWidth(200);
		tB2.setHeight(70);
		stage.addActor(tB2);
		
		
//		MoveToAction move = new MoveToAction();
//		move.setX(400);
//		move.setY(100);
//		move.setDuration(2f);
//		tB1.addAction(move);
		
		tB1.addListener(new ClickListener(){

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
				GameControl.getManagerScreen().createScreen(ManagerScreen.SCREEN_PLAY);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				return super.touchDown(event, x, y, pointer, button);
			}
		});
		
		tB2.addListener(new ClickListener(){

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				return super.touchDown(event, x, y, pointer, button);
			}

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
				Gdx.app.exit();
			}
			
		});
	}
	
	@Override
	public void render(float arg0) {
		super.render(arg0);
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
