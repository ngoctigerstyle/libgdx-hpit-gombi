package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;
import com.vn.libgdx.gombi.screen.play.bi.BiXam;

public class GroupBi extends Group{

	public GroupBi() {
		super();
		this.setX(125);
		this.setY(40);
		this.setWidth(500);
		this.setHeight(300);
		khoiTaoBi(this.BI_XAM);
	}
	
	private static int BI_XAM = 0;
	private static int BI_VANG = 1;
	private static int BI_XANH = 2;
	private static int BI_DO = 3;
	
	private void khoiTaoBi(int maBi){
		switch (maBi) {
		case 0:
			BiXam biXam = new BiXam();
			this.addActor(biXam);
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
