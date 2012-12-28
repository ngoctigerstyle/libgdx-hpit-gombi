package com.vn.gombi.screen.play;

import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.gombi.gamelogic.GameControl;

public class BottomTaskBar extends Group {

	private Image iBottom;
	private int iLong;
	private boolean bRemain;

	public static int NONE = 0;
	public static int BIDO_SPEED_INC = 1;
	public static int BIDO_SPEED_DES = 2;
	public static int BI_XAM_SIEU_NHAN = 3;
	
	public enum eStatus{
		NONE, BIDO_SPEED_INC, BIDO_SPEED_DES, BI_XAM_SIEU_NHAN
	}
	
	public int status;
	
	public BottomTaskBar() {
		super();
		iLong = 677;
		bRemain = false;
		init();
	}

	private void init() {
		NinePatch ninePatch = new NinePatch(GameControl.getAtlas().findRegion(
				"play/bottom"), 8, 8, 8, 8);
		iBottom = new Image(ninePatch);
		iBottom.setX(111);
		iBottom.setY(10);
		iBottom.setWidth(iLong);
		iBottom.setHeight(15);
		this.addActor(iBottom);
	}

	private void remainTime() {
		iLong -= 2;
		iBottom.setWidth(iLong);
		iBottom.invalidate();

		if (iLong < 10) {
			bRemain = false;
			iLong = 677;
		}
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		if (bRemain == true)
			remainTime();
//		callRemain();
	}

	public void callRemain() {
		bRemain = true;
	}
}
