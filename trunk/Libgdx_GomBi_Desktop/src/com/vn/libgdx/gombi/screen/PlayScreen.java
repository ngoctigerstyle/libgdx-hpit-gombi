package com.vn.libgdx.gombi.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class PlayScreen extends BaseScreen{

	private Label label;
	private Image imgKhung;
	
	@Override
	public void show() {
		super.show();
		label = new Label("play screen", GameControl.getMySkin(), "default");
		stage.addActor(label);
		
		NinePatch np = new NinePatch(GameControl.getAtlas().findRegion("play/khung"),180,50,70,50);
		
		imgKhung = new Image(np);
		imgKhung.setX(0);
		imgKhung.setY(0);
		imgKhung.setWidth(800);
		imgKhung.setHeight(480);
		stage.addActor(imgKhung);
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		super.hide();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		super.pause();
	}

	@Override
	public void render(float arg0) {
		// TODO Auto-generated method stub
		super.render(arg0);
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		super.resize(arg0, arg1);
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		super.resume();
	}

}
