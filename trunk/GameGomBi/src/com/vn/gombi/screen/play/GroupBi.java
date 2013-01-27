package com.vn.gombi.screen.play;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.vn.gombi.screen.PlayScreen;
import com.vn.gombi.screen.play.bi.BiDo;
import com.vn.gombi.screen.play.bi.BiVang;
import com.vn.gombi.screen.play.bi.BiXam;
import com.vn.gombi.screen.play.bi.BiXanh;

public class GroupBi extends Group {

	private PlayScreen playScreen;

	private SpriteBatch sb;
	
	public static int X = 25;
	public static int Y = 59;

	public static int WIDTH = 633;
	public static int HEIGH = 374;

	private Group gBiMau;
	private BiXam biXam;
	private BiXanh biXanh;
	private BiVang biVang;
	private ParticleEffect particleEffect;

	public GroupBi(PlayScreen playScreen) {
		super();
		this.playScreen = playScreen;
		this.setX(GroupBi.X);
		this.setY(GroupBi.Y);
		this.setWidth(GroupBi.WIDTH);
		this.setHeight(GroupBi.HEIGH);
		this.sb = playScreen.getSpriteBatch();
		
		particleEffect = new ParticleEffect();
		particleEffect.load(Gdx.files.internal("MyParticle/lua2.p"), Gdx.files.internal("MyParticle"));

		PlayScreen.PAUSE_GAME = false;

		gBiMau = new Group();
		this.addActor(gBiMau);

		khoiTaoBi(BI_VANG);
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
//			Gdx.app.log("sdf", "khoi tao xam");
			break;
		case 1:
			biVang = new BiVang();
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
		for (Actor a : gBiMau.getChildren())
			if (a instanceof BiDo){
//				Gdx.app.log("bi do", "tang toc");
				((BiDo) a).incSpeed();
			}
	}
	
	public void desSpeedRed(){
		for (Actor a : gBiMau.getChildren())
			if (a instanceof BiDo){
//				Gdx.app.log("bi do", "giam toc");
				((BiDo) a).desSpeed();
			}
	}
	
	public void resetSpeedRed(){
		for (Actor a : gBiMau.getChildren())
			if (a instanceof BiDo)
				((BiDo) a).resetSpeed();
	}
	
	public void randomDirectionRed(){
		for (Actor a : gBiMau.getChildren())
			if (a instanceof BiDo)
				((BiDo) a).randomDirection();
	}
	
	public void startParticle(float x, float y){
		particleEffect.setPosition(x + X, y + Y);
		particleEffect.start();
	}
	
	@Override
	public void act(float arg0) {
		super.act(arg0);
		sb.begin();
		particleEffect.draw(sb, arg0);
		sb.end();
	}

	public BiXam getBiXam() {
		return biXam;
	}
	
	public BiVang getBiVang(){
		return biVang;
	}

	public Group getGroupBiMau() {
		return gBiMau;
	}
	
	public PlayScreen getPlayScreen(){
		return playScreen;
	}
}
