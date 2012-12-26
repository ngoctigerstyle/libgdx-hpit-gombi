package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class KhungGame extends Group{

	private Image imgKhung;
	
	public KhungGame() {
		super();
		
		NinePatch np = new NinePatch(GameControl.getAtlas().findRegion("play-khung"),180,50,70,50);
		
		imgKhung = new Image(np);
		imgKhung.setX(0);
		imgKhung.setY(0);
		imgKhung.setWidth(800);
		imgKhung.setHeight(480);
		this.addActor(imgKhung);
	}
}
