package com.vn.libgdx.gombi.gamelogic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.screen.ManagerScreen;

public class GameControl extends Game{
	private static ManagerScreen managerScreen;
	private static MySkin mySkin;
	private static TextureAtlas atlas;
	
	@Override
	public void create() {
		atlas = new TextureAtlas(Gdx.files.internal("MyDataPacker/MoTa.txt"));
		mySkin = new MySkin();
		managerScreen = new ManagerScreen();
		this.setScreen(managerScreen.createScreen(ManagerScreen.SCREEN_PLAY));
	}


	@Override
	public void render() {
		if (managerScreen.getScreen()!= null)
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
	
	public static ManagerScreen getManagerScreen(){
		return managerScreen;
	}
}
