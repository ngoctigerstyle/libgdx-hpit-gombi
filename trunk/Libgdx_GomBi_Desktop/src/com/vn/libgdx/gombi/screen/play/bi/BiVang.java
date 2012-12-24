package com.vn.libgdx.gombi.screen.play.bi;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class BiVang extends BiBase{

	public BiVang() {
		super();
		image = new Image(GameControl.getAtlas().findRegion("play/bi/vang"));
		this.addActor(image);
		randomViTri();
		setXY_Max();
	}
}