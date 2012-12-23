package com.vn.libgdx.gombi.screen;

import com.vn.libgdx.gombi.screen.play.KhungGame;
import com.vn.libgdx.gombi.screen.play.LeftTaskBar;

public class PlayScreen extends BaseScreen{

	private KhungGame khungGame;
	private LeftTaskBar leftTaskBar;
	
	@Override
	public void show() {
		super.show();
		
		khungGame = new KhungGame();
		stage.addActor(khungGame);
		
		leftTaskBar = new LeftTaskBar();
		stage.addActor(leftTaskBar);
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
