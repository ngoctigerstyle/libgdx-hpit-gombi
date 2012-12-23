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
		stage.addActor(menuBall);
		menuBall.setX((stage.getWidth()-menuBall.getWidth())/2);
		menuBall.setY(200);
		
		TextButton tB1 = new TextButton("new game", GameControl.getMySkin(), "default");
		tB1.setX(100);
		tB1.setY(100);
		tB1.setWidth(200);
		tB1.setHeight(70);
		stage.addActor(tB1);
		
//		MoveToAction move = new MoveToAction();
//		move.setX(500);
//		move.setY(100);
//		move.setDuration(2f);
//		tB1.addAction(move);
		//GameControl.getManagerScreen().createScreen(ManagerScreen.SCREEN_PLAY);
		
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
