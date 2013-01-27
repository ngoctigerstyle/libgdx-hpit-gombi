package com.vn.gombi.screen.play.bi;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.vn.gombi.constant.Constant;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.helper.SoundManager;
import com.vn.gombi.screen.PlayScreen;
import com.vn.gombi.screen.play.GroupBi;

public class BiXam extends BiBase {

	private GroupBi groupBi;
	private static int X_DEFAULT = 158;
	private static int Y_DEFAULT = 58;
	private Vector2 viTriCuoi;
	private int iTocDo;
	private boolean bSuper;
	private int xHand, yHand;

	public BiXam(GroupBi groupBi) {
		super();
		this.groupBi = groupBi;
		textureRegionDrawable.setRegion(GameControl.getAtlas().findRegion("play/bi-xam"));
		this.setDrawable();
		this.setX(X_DEFAULT);
		this.setY(Y_DEFAULT);
		setXY_Max();
		viTriCuoi = new Vector2(this.getX(), this.getY());
		if (Constant.GAME_STYLE == Constant.TOUCH)
			dieuKhienTouch();
		iTocDo = 4;
		bSuper = false;
		xHand = 120;
		yHand = 60;
	}

	public void dieuKhienTouch() {
		ClickListener click = new ClickListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				setViTriCuoi(x - xHand, y + yHand);
				return super.touchDown(event, x, y, pointer, button);
			}

			@Override
			public void touchDragged(InputEvent event, float x, float y,
					int pointer) {
				setViTriCuoi(x - xHand - 5, y + yHand);
				super.touchDragged(event, x, y, pointer);
			}
		};
		groupBi.addListener(click);
	}
	
	public void dieuKhienAccelerometer(){
//		Gdx.app.log(String.valueOf(Gdx.input.getAccelerometerX()), 
//				String.valueOf(Gdx.input.getAccelerometerY()));
		float xTemp = this.getX() + Gdx.input.getAccelerometerY();
		if (xTemp < 0)
			xTemp = 0;
		if (xTemp > x_max)
			xTemp = x_max;
		
		if (Math.abs(Gdx.input.getAccelerometerY()) > 1)
			this.setX(xTemp);
		
		float yTemp = this.getY() - Gdx.input.getAccelerometerX();
		if (yTemp < 0)
			yTemp = 0;
		if (yTemp > y_max)
			yTemp = y_max;
		
		if (Math.abs(Gdx.input.getAccelerometerX()) > 1)
			this.setY(yTemp);
	}

	private void setViTriCuoi(float x, float y) {
		float xTemp = x;
		if (xTemp < 0)
			xTemp = 0;
		if (xTemp > x_max)
			xTemp = x_max;
		float yTemp = y;
		if (yTemp < 0)
			yTemp = 0;
		if (yTemp > y_max)
			yTemp = y_max;
		viTriCuoi.set(xTemp, yTemp);
	}

	private void diChuyenTouch() {
		if (viTriCuoi.x > this.getX() + iTocDo)
			this.incX(iTocDo);
		if (viTriCuoi.x < this.getX() - iTocDo)
			this.desX(iTocDo);
		if (viTriCuoi.y > this.getY() + iTocDo)
			this.incY(iTocDo);
		if (viTriCuoi.y < this.getY() - iTocDo)
			this.desY(iTocDo);
	}

	public void setSuper(boolean bSuper) {
		this.bSuper = bSuper;
		if (bSuper)
			textureRegionDrawable.setRegion(GameControl.getAtlas().findRegion("play/bi-xam-super"));
		else
			textureRegionDrawable.setRegion(GameControl.getAtlas().findRegion("play/bi-xam"));
	}

	private void checkCollision(Group gBiMau) {
		Actor a = gBiMau.hit(this.getX_ImageAverage(),
				this.getY_ImageAverage(), false);
		Actor a1 = gBiMau.hit(this.getX(),
				this.getY(), false);
		Actor a2 = gBiMau.hit(this.getX_ImageAverage2(),
				this.getY_ImageAverage(), false);
		Actor a3 = gBiMau.hit(this.getX_ImageAverage(),
				this.getY_ImageAverage2(), false);
		Actor a4 = gBiMau.hit(this.getX(),
				this.getY_ImageAverage(), false);
		
		Actor aTemp = null;
		if (a1 != null)
			aTemp = a1;
		if (a2 != null)
			aTemp = a2;
		if (a3 != null)
			aTemp = a3;
		if (a4 != null)
			aTemp = a4;
		
		if (aTemp != null) {
			if (aTemp instanceof BiVang)
				chamBiVang((BiVang) aTemp);
			else if (aTemp instanceof BiXanh)
				chamBiXanh((BiXanh) aTemp);
		}
		
		if (a != null){
			if (a instanceof BiDo)
				chamBiDo((BiDo) a);
		}
	}

	private void chamBiVang(BiVang biVang) {
		groupBi.getBiVang().setMyVisible(false);
		SoundManager.playSound(SoundManager.SOUND_EAT);
		groupBi.startParticle(biVang.getX_ImageAverage(), biVang.getY_ImageAverage());
		groupBi.getPlayScreen().getBottomTaskBar().putPower();
	}

	private void chamBiDo(BiDo biDo) {
//		Gdx.app.log("sdf", "do");
		SoundManager.playSound(SoundManager.SOUND_BOOM);
		groupBi.startParticle(getX_ImageAverage(), getY_ImageAverage());
		if (bSuper == false) {
			this.setChay(false);
			groupBi.getBiXam().setVisible(false);
			for (Actor a : groupBi.getGroupBiMau().getChildren())
				((BiBase) a).setChay(false);
			groupBi.getPlayScreen().getLeftTaskBar().endGame();
			PlayScreen.PAUSE_GAME = true;
			groupBi.getPlayScreen().showKetQua();
		}else{
			biDo.remove();
			biDo = null;
		}
	}

	private void chamBiXanh(BiXanh biXanh) {
//		Gdx.app.log("sdf", "xanh");
		SoundManager.playSound(SoundManager.SOUND_EAT);
		groupBi.startParticle(biXanh.getX_ImageAverage(), biXanh.getY_ImageAverage());
		biXanh.doiViTri();
		BiDo biDo = new BiDo(groupBi);
		groupBi.getGroupBiMau().addActor(biDo);
		groupBi.getPlayScreen().getLeftTaskBar().biXamAnBiXanh();
		
		Random r = new Random();
		int i = r.nextInt(3);
		if (i == 0)
			groupBi.getBiVang().setMyVisible(true);
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		if (PlayScreen.PAUSE_GAME == false) {
			if (Constant.GAME_STYLE == Constant.TOUCH)
				diChuyenTouch();
			if (Constant.GAME_STYLE == Constant.ACCELEROMETER)
				dieuKhienAccelerometer();
			checkCollision(groupBi.getGroupBiMau());
		}
	}
}
