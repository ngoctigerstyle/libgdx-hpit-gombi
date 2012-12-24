package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class BottomTaskBar extends Group{

	private Image iBottom;
	
	public BottomTaskBar() {
		super();
		init();
	}
	
	private void init(){
		
		NinePatch ninePatch = new NinePatch(GameControl.getAtlas().findRegion("play/bottom"),8 ,8 ,8 ,8);
		
		iBottom = new Image(ninePatch);
		iBottom.setX(111);
		iBottom.setY(10);
		iBottom.setWidth(677);
		iBottom.setHeight(15);
		this.addActor(iBottom);
	}
}
