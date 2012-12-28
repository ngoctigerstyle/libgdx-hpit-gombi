package com.vn.gombi.screen.play.bi;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.vn.gombi.gamelogic.GameControl;

public class BiVang extends BiBase {

	public BiVang() {
		super();
		textureRegionDrawable.setRegion(GameControl.getAtlas().findRegion(
				"play/bi-vang"));
		setDrawable();
		this.setVisible(true);
		randomViTri();
		setXY_Max();
	}

	public void biMoi() {
		randomViTri();
		this.setVisible(true);
	}

	private void biXamChamBiVang() {

	}
}