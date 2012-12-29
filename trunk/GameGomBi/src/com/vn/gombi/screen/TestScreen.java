package com.vn.gombi.screen;

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
