package com.vn.libgdx.gombi.screen;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class MenuScreen extends BaseScreen{

	private TextureRegion region;
	private Label label;
	
	@Override
	public void show() {
		super.show();
		region = new TextureRegion(GameControl.getAtlas().findRegion("hinh1/badlogic"));
		Image i = new Image(region);
		stage.addActor(i);
		
		label = new Label("main menu", GameControl.getMySkin(), "default");
		label.setX(200);
		label.setY(300);
		stage.addActor(label);
	}
	
	@Override
	public void render(float arg0) {
		super.render(arg0);
		sb.begin();
		//sb.draw(region, 500,400);
		sb.end();
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
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		super.resize(arg0, arg1);
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		super.resume();
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
	}
	
}
