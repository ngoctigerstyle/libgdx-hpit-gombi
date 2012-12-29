package com.vn.gombi.gamelogic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.vn.gombi.helper.MySkin;
import com.vn.gombi.helper.SoundManager;
import com.vn.gombi.screen.ManagerScreen;

public class GameControl extends Game {
	private static ManagerScreen managerScreen;
	private static MySkin mySkin;
	private static TextureAtlas atlas;
	@SuppressWarnings("unused")
	private SoundManager soundManager;

	@Override
	public void create() {
		atlas = new TextureAtlas(Gdx.files.internal("../GameGomBi-android/assets/MyDataPacker/MoTa.txt"));
		mySkin = new MySkin();
		managerScreen = new ManagerScreen();
		this.setScreen(managerScreen.createScreen(ManagerScreen.SCREEN_MENU));
		soundManager = new SoundManager();
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {
		if (managerScreen.getScreen() != null)
			managerScreen.getScreen().render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	public static TextureAtlas getAtlas() {
		return atlas;
	}

	public static MySkin getMySkin() {
		return mySkin;
	}

	public static ManagerScreen getManagerScreen() {
		return managerScreen;
	}
}