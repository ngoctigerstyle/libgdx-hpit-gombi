package com.vn.gombi.screen.play.bi;

import com.vn.gombi.gamelogic.GameControl;

public class BiVang extends BiBase {

	public BiVang() {
		super();
		textureRegionDrawable.setRegion(GameControl.getAtlas().findRegion(
				"play/bi-vang"));
		setDrawable();
		this.setVisible(false);
		randomViTri();
		setXY_Max();
	}

	public void setMyVisible(boolean bVisible) {
		if (bVisible){
			randomViTri();
			this.setVisible(true);
		}else if (bVisible == false){
			this.setVisible(false);
		}
	}
}