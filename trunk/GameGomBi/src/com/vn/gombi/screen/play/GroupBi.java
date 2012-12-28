package com.vn.gombi.screen.play;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.vn.gombi.helper.MyInput;
import com.vn.gombi.screen.PlayScreen;
import com.vn.gombi.screen.play.bi.BiDo;
import com.vn.gombi.screen.play.bi.BiVang;
import com.vn.gombi.screen.play.bi.BiXam;
import com.vn.gombi.screen.play.bi.BiXanh;

public class GroupBi extends Group {

	private PlayScreen playScreen;

	public static int X = 125;
	public static int Y = 40;

	public static int WIDTH = 600;
	public static int HEIGH = 400;

	private Group gBiMau;
	private BiXam biXam;
	private BiXanh biXanh;
	private BiVang biVang;

	public GroupBi(PlayScreen playScreen) {
		super();
		this.playScreen = playScreen;
		this.setX(GroupBi.X);
		this.setY(GroupBi.Y);
		this.setWidth(GroupBi.WIDTH);
		this.setHeight(GroupBi.HEIGH);

		PlayScreen.PAUSE_GAME = false;

		gBiMau = new Group();
		this.addActor(gBiMau);

//		khoiTaoBi(BI_VANG);
		khoiTaoBi(BI_XANH);
		khoiTaoBi(BI_XAM);
		khoiTaoBi(BI_DO);

	}

	private static int BI_XAM = 0;
	public static int BI_VANG = 1;
	private static int BI_XANH = 2;
	private static int BI_DO = 3;

	public void khoiTaoBi(int maBi) {
		switch (maBi) {
		case 0:
			biXam = new BiXam(this);
			this.addActor(biXam);
			break;
		case 1:
			BiVang biVang = new BiVang();
			gBiMau.addActor(biVang);
			break;
		case 2:
			biXanh = new BiXanh();
			gBiMau.addActor(biXanh);
			break;
		case 3:
			BiDo biDo = new BiDo(this);
			gBiMau.addActor(biDo);
			break;
		}
	}

	public void incSpeedRed(){
		for (Actor a : this.getChildren())
			if (a instanceof BiDo)
				((BiDo) a).incSpeed();
	}
	
	public void desSpeedRed(){
		for (Actor a : this.getChildren())
			if (a instanceof BiDo)
				((BiDo) a).desSpeed();
	}
	
	public void resetSpeedRed(){
		for (Actor a : this.getChildren())
			if (a instanceof BiDo)
				((BiDo) a).resetSpeed();
	}
	
	@Override
	public void act(float arg0) {
		super.act(arg0);
	}

	public BiXam getBiXam() {
		return biXam;
	}

	public Group getGroupBiMau() {
		return gBiMau;
	}
	
	public PlayScreen getPlayScreen(){
		return playScreen;
	}
}