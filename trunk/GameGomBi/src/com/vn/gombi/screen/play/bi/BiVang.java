package com.vn.gombi.screen.play.bi;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.gombi.gamelogic.GameControl;

public class BiVang extends BiBase{

	public BiVang() {
		super();
		image = new Image(GameControl.getAtlas().findRegion("play/bi-vang"));
		this.addActor(image);
		image.setVisible(false);
		randomViTri();
		setXY_Max();
	}
	
	public void biMoi(){
		randomViTri();
		image.setVisible(true);
	}
	
	private void biXamChamBiVang(){
		
	}
}