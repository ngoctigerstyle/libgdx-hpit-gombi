package com.vn.gombi.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.screen.play.bi.BiVang;

public class TestScreen extends BaseScreen {

	private BiVang biVang;
	
	@Override
	public void show() {
		super.show();
		biVang = new BiVang();
		stage.addActor(biVang);
	}

	@Override
	public void render(float arg0) {
		super.render(arg0);
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}
