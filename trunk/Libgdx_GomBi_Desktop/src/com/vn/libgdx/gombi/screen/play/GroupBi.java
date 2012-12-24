package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.vn.libgdx.gombi.screen.play.bi.BiBase;
import com.vn.libgdx.gombi.screen.play.bi.BiDo;
import com.vn.libgdx.gombi.screen.play.bi.BiVang;
import com.vn.libgdx.gombi.screen.play.bi.BiXam;
import com.vn.libgdx.gombi.screen.play.bi.BiXanh;

public class GroupBi extends Group{

	public static int X = 125;
	public static int Y = 40;
	
	public static int WIDTH = 650;
	public static int HEIGH = 405;
	
	private BiXam biXam;
	private BiXanh biXanh;
	private BiVang biVang;
	private Group gBiDo;
	
	public GroupBi() {
		super();
		this.setX(this.X);
		this.setY(this.Y);
		this.setWidth(this.WIDTH);
		this.setHeight(this.HEIGH);
		
		gBiDo = new Group();
		this.addActor(gBiDo);
		
		khoiTaoBi(BI_VANG);
		khoiTaoBi(BI_XANH);
		khoiTaoBi(BI_DO);
		khoiTaoBi(BI_XAM);
	}
	
	private static int BI_XAM = 0;
	private static int BI_VANG = 1;
	private static int BI_XANH = 2;
	private static int BI_DO = 3;
	
	private void khoiTaoBi(int maBi){
		switch (maBi) {
		case 0:
			biXam = new BiXam(this);
			this.addActor(biXam);
			break;
		case 1:
			BiVang biVang = new BiVang();
			this.addActor(biVang);
			break;
		case 2:
			biXanh = new BiXanh();
			this.addActor(biXanh);
			break;
		case 3:
			BiDo biDo = new BiDo();
			gBiDo.addActor(biDo);
			break;
		}
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		checkBiXamAnBiXanh();
		checkBiXamTrungBiDo();
	}
	
	private void checkBiXamAnBiXanh(){
		Actor a = biXanh.hit(biXam.getX_Image(), biXam.getY_Image(), false);
		if (a != null)
			biXamAnBiXanh();
	}
	
	private void biXamAnBiXanh(){
		biXanh.doiViTri();
		BiDo biDo= new BiDo();
		gBiDo.addActor(biDo);
	}
	
	private void checkBiXamTrungBiDo(){
		
	}
}
