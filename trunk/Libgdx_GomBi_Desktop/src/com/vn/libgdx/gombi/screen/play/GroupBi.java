package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class GroupBi extends Group{

	public GroupBi() {
		super();
		//kh
	}
	
	private static int BI_XAM = 0;
	private static int BI_VANG = 1;
	private static int BI_XANH = 2;
	private static int BI_DO = 3;
	
	private void khoiTaoBi(int maBi){
		switch (maBi) {
		case 0:
			Image imgBi = new Image(GameControl.getAtlas().findRegion("play/bi/xam"));
			this.addActor(imgBi);
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}

}
