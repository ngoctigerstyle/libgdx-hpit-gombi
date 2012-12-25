package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;
import com.vn.libgdx.gombi.helper.Input;

public class BottomTaskBar extends Group{

	private Image iBottom;
	private int iLong;
	private boolean bRemain;
	
	public BottomTaskBar() {
		super();
		iLong = 677;
		bRemain = false;
		init();
	}
	
	private void init(){
		NinePatch ninePatch = new NinePatch(GameControl.getAtlas().findRegion("play/bottom"),8 ,8 ,8 ,8);
		iBottom = new Image(ninePatch);
		iBottom.setX(111);
		iBottom.setY(10);
		iBottom.setWidth(iLong);
		this.addActor(iBottom);
	}

	private void remainTime(){
		iLong-=2;
		iBottom.setWidth(iLong);
		iBottom.invalidate();
		
		if (iLong < 0){
			bRemain = false;
			iLong = 677;
		}
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		if (bRemain == true)
			remainTime();
		remainTime();
	}
	
	public void callRemain(){
		bRemain = true;
	}
}
