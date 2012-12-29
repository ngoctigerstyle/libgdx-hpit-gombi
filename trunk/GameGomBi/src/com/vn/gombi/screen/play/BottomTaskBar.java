package com.vn.gombi.screen.play;

import java.util.Random;

import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.screen.PlayScreen;

public class BottomTaskBar extends Group {

	private Image iBottom;
	private int iLong;
	private boolean bRemain;
	private PlayScreen playScreen;

	public static int NONE = 0;
	public static int BI_DO_SPEED_INC = 1;
	public static int BI_DO_SPEED_DES = 2;
	public static int BI_XAM_SIEU_NHAN = 3;
	public static int BI_DO_RANDOM_DIRECTION = 4;
	
	private int iPower;
	
	public int status;
	
	public BottomTaskBar(PlayScreen playScreen) {
		super();
		this.playScreen = playScreen;
		iLong = 677;
		bRemain = false;
		iPower = NONE;
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
	
	public void putPower(){
		bRemain = true;
		iLong = 677;
		Random r = new Random();
		iPower = r.nextInt(4) + 1;
//		iPower = 3;
		
		if (iPower == BI_DO_SPEED_INC){
			playScreen.getLeftTaskBar().setLabelPower("Fast speed red");
			playScreen.getGroupBi().incSpeedRed();
		}else if (iPower == BI_DO_SPEED_DES){
			playScreen.getLeftTaskBar().setLabelPower("Low speed red");
			playScreen.getGroupBi().desSpeedRed();
		}else if (iPower == BI_XAM_SIEU_NHAN){
			playScreen.getLeftTaskBar().setLabelPower("Super gray");
			playScreen.getGroupBi().getBiXam().setSuper(true);
		}else if (iPower == BI_DO_RANDOM_DIRECTION){
			playScreen.getLeftTaskBar().setLabelPower("Red change move");
			playScreen.getGroupBi().randomDirectionRed();
		}
	}
	
	private void resetPower(){
		playScreen.getLeftTaskBar().resetLabelPower();
		playScreen.getGroupBi().resetSpeedRed();
		playScreen.getGroupBi().getBiXam().setSuper(false);
		if (iPower == 4)
			playScreen.getGroupBi().randomDirectionRed();
	}

	/**
	 * Keo ngan thanh thoi gian.
	 */
	private void remainTime() {
		iLong -= 2;
		iBottom.setWidth(iLong);
		iBottom.invalidate();
		if (iLong < 10) {
			resetPower();
			iPower = NONE;
			bRemain = false;
			iLong = 677;
			iBottom.setWidth(iLong);
		}
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		if (bRemain == true){
			remainTime();
		}
	}
}
