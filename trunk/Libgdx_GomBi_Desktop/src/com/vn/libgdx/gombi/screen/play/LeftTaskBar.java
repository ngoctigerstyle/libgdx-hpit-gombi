package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class LeftTaskBar extends Group{

	public LeftTaskBar() {
		super();
		
		Image imgLogo = new Image(GameControl.getAtlas().findRegion("menu/ball-text"));
		imgLogo.setX(15);
		imgLogo.setY(420);
		imgLogo.setWidth(80);
		imgLogo.setHeight(30);
		this.addActor(imgLogo);
	}
}
