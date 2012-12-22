package com.vn.libgdx.gombi.gamelogic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.vn.libgdx.gombi.screen.ManagerScreen;

public class GameControl extends Game{
	private ManagerScreen managerScreen;
	@Override
	public void create() {
		managerScreen = new ManagerScreen();
	}



	@Override
	public void render() {
		managerScreen.getScreen().render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void resize(int arg0, int arg1) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
	
	@Override
	public void dispose() {
		
	}
}
