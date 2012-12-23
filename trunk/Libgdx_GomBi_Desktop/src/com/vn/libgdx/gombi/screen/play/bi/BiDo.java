package com.vn.libgdx.gombi.screen.play.bi;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class BiDo extends Group{

	public BiDo() {
		super();
		Image image = new Image(GameControl.getAtlas().findRegion("play/bi/do"));
		this.addActor(image);
	}

}
