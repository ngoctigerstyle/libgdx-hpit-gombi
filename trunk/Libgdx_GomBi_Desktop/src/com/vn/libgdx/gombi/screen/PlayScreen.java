package com.vn.libgdx.gombi.screen;

import com.vn.libgdx.gombi.screen.play.GroupBi;
import com.vn.libgdx.gombi.screen.play.KhungGame;
import com.vn.libgdx.gombi.screen.play.LeftTaskBar;
import com.vn.libgdx.gombi.screen.play.NenGach;

public class PlayScreen extends BaseScreen{

	private NenGach nenGach;
	private KhungGame khungGame;
	private LeftTaskBar leftTaskBar;
	private GroupBi groupBi;
	
	@Override
	public void show() {
		super.show();
		
		nenGach = new NenGach(this);
		stage.addActor(nenGach);
		
		khungGame = new KhungGame();
		stage.addActor(khungGame);
		
		leftTaskBar = new LeftTaskBar();
		stage.addActor(leftTaskBar);
		
		groupBi = new GroupBi(this);
		stage.addActor(groupBi);
	}
	
	public LeftTaskBar getLeftTaskBar(){
		return leftTaskBar;
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
