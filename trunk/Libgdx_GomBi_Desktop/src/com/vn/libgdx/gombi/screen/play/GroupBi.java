package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.vn.libgdx.gombi.helper.Input;
import com.vn.libgdx.gombi.screen.PlayScreen;
import com.vn.libgdx.gombi.screen.play.bi.BiBase;
import com.vn.libgdx.gombi.screen.play.bi.BiDo;
import com.vn.libgdx.gombi.screen.play.bi.BiVang;
import com.vn.libgdx.gombi.screen.play.bi.BiXam;
import com.vn.libgdx.gombi.screen.play.bi.BiXanh;

public class GroupBi extends Group{

	private PlayScreen playScreen;
	
	public static int X = 125;
	public static int Y = 40;
	
	public static int WIDTH = 650;
	public static int HEIGH = 405;
	
	private BiXam biXam;
	private BiXanh biXanh;
	private BiVang biVang;
	private Group gBiDo;
	
	private boolean pauseGame;
	
	public GroupBi(PlayScreen playScreen) {
		super();
		this.playScreen = playScreen;
		this.setX(this.X);
		this.setY(this.Y);
		this.setWidth(this.WIDTH);
		this.setHeight(this.HEIGH);
		
		pauseGame = false;
		
		gBiDo = new Group();
		this.addActor(gBiDo);
		
		//khoiTaoBi(BI_VANG);
		khoiTaoBi(BI_XANH);
		khoiTaoBi(BI_XAM);
		khoiTaoBi(BI_DO);
		
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
			BiDo biDo = new BiDo(this);
			gBiDo.addActor(biDo);
			break;
		}
	}
	
	

	@Override
	public void act(float arg0) {
		super.act(arg0);
		
		checkBiXamAnBiXanh();
		
		if (pauseGame == false)
			checkBiXamTrungBiDo();
		
		//ham nay de test.
		if (Input.pressKey(Keys.NUM_1))
			biXamTrungBiDo();
	}
	
	private void checkBiXamAnBiXanh(){
		Actor a = biXanh.hit(biXam.getX_Image(), biXam.getY_Image(), false);
		if (a != null)
			biXamAnBiXanh();
	}
	
	private void biXamAnBiXanh(){
		biXanh.doiViTri();
		BiDo biDo= new BiDo(this);
		gBiDo.addActor(biDo);
		playScreen.getLeftTaskBar().biXamAnBiXanh();
	}
	
	private void checkBiXamTrungBiDo(){
		Actor a = gBiDo.hit(biXam.getX_Image(), biXam.getY_Image(), false);
		if (a != null)
			biXamTrungBiDo();
	}
	
	private void biXamTrungBiDo(){
		biXam.setChay(false);
		for (Actor a : gBiDo.getChildren())
			if (a instanceof BiDo){
				((BiDo)a).setChay(false);
			}
		playScreen.getLeftTaskBar().endGame();
		pauseGame = true;
		playScreen.showKetQua();
	}
	
	public BiXam getBiXam(){
		return biXam;
	}
}
