package com.vn.gombi.screen.play;

import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.gombi.gamelogic.GameControl;

public class KhungGame extends Group {

	private Image imgKhung;

	public KhungGame() {
		super();

		NinePatch np = new NinePatch(GameControl.getAtlas().findRegion(
				"play/khung",3), 50, 180, 70, 69);

		imgKhung = new Image(np);
		imgKhung.setX(0);
		imgKhung.setY(0);
		imgKhung.setWidth(800);
		imgKhung.setHeight(480);
		this.addActor(imgKhung);
	}
}