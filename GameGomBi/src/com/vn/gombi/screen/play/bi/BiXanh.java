package com.vn.gombi.screen.play.bi;

import com.vn.gombi.gamelogic.GameControl;

public class BiXanh extends BiBase {

	public BiXanh() {
		super();
		textureRegionDrawable.setRegion(GameControl.getAtlas().findRegion(
				"play/bi-xanh"));
		this.setDrawable();
		doiViTri();
		setXY_Max();
	}

	public void doiViTri() {
		randomViTri();
	}
}