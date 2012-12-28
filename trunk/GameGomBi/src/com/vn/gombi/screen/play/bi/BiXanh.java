package com.vn.gombi.screen.play.bi;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.gombi.gamelogic.GameControl;

public class BiXanh extends BiBase{

	public BiXanh() {
		super();
		image = new Image(GameControl.getAtlas().findRegion("play/bi-xanh"));
		doiViTri();
		this.addActor(image);
		
		setXY_Max();
	}
	
	public void doiViTri(){
		randomViTri();
	}
}