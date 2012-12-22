package com.vn.libgdx.gombi.gamelogic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.vn.libgdx.gombi.screen.ManagerScreen;

public class GameControl extends Game{
	private ManagerScreen managerScreen;
	private static MySkin mySkin;
	private static TextureAtlas atlas;
	
	@Override
	public void create() {
		atlas = new TextureAtlas(Gdx.files.internal("MyDataPacker/FileMoTa.txt"));
		mySkin = new MySkin();
		managerScreen = new ManagerScreen();
		managerScreen.createScreen(ManagerScreen.SCREEN_MENU);
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
	
	public static TextureAtlas getAtlas(){
		return atlas;
	}
	
	public static MySkin getMySkin(){
		return mySkin;
	}
}
