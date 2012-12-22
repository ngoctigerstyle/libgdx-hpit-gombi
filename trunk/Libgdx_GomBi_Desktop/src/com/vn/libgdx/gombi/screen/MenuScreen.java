package com.vn.libgdx.gombi.screen;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class MenuScreen extends BaseScreen{

	@Override
	public void show() {
		super.show();
		Image menuBall = new Image(new TextureRegion(GameControl.getAtlas().findRegion("menu/ball-text")));
		stage.addActor(menuBall);
		menuBall.setX((stage.getWidth()-menuBall.getWidth())/2);
		menuBall.setY(200);
	}
	
	@Override
	public void render(float arg0) {
		super.render(arg0);
		sb.begin();
		sb.end();
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
