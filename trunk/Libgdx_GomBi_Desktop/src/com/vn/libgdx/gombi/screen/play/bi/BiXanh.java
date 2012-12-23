package com.vn.libgdx.gombi.screen.play.bi;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class BiXanh extends Group{

	public BiXanh() {
		super();
		Image image = new Image(GameControl.getAtlas().findRegion("play/bi/xanh"));
		this.addActor(image);
	}
}
