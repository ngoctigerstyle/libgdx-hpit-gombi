package com.vn.libgdx.gombi.screen.play.bi;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class BiXam extends Group{

	public BiXam() {
		super();
		Image image = new Image(GameControl.getAtlas().findRegion("play/bi/xam"));
		this.addActor(image);
	}
}
