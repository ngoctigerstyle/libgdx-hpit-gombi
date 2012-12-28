package com.vn.gombi.screen.play.bi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.screen.PlayScreen;
import com.vn.gombi.screen.play.GroupBi;

public class BiXam extends BiBase {

	private GroupBi groupBi;
	private static int X_DEFAULT = 158;
	private static int Y_DEFAULT = 58;
	private Vector2 viTriCuoi;
	private int iTocDo;

	public BiXam(GroupBi groupBi) {
		super();
		this.groupBi = groupBi;
		textureRegionDrawable.setRegion(GameControl.getAtlas().findRegion(
				"play/bi-xam"));
		this.setDrawable();
		this.setX(X_DEFAULT);
		this.setY(Y_DEFAULT);
		setXY_Max();
		viTriCuoi = new Vector2(this.getX(), this.getY());
		dieuKhien();
		iTocDo = 4;
	}

	public void dieuKhien() {
		ClickListener click = new ClickListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				setViTriCuoi(x, y);
				return super.touchDown(event, x, y, pointer, button);
			}

			@Override
			public void touchDragged(InputEvent event, float x, float y,
					int pointer) {
				setViTriCuoi(x, y);
				super.touchDragged(event, x, y, pointer);
			}
		};
		groupBi.addListener(click);
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
		// Gdx.app.log(String.valueOf(viTriCuoi.x),
		// String.valueOf(viTriCuoi.y));
	}

	private void diChuyen() {
		if (viTriCuoi.x > this.getX() + iTocDo)
			this.incX(iTocDo);
		if (viTriCuoi.x < this.getX() - iTocDo)
			this.desX(iTocDo);
		if (viTriCuoi.y > this.getY() + iTocDo)
			this.incY(iTocDo);
		if (viTriCuoi.y < this.getY() - iTocDo)
			this.desY(iTocDo);
	}
	
	private void checkCollision(Group gBiMau){
		Actor a = gBiMau.hit(this.getX_ImageAverage(), this.getY_ImageAverage(), false);
		if (a != null){
			if (a instanceof BiVang)
				chamBiVang((BiVang)a);
			else if (a instanceof BiXanh)
				chamBiXanh((BiXanh)a);
			else if (a instanceof BiDo)
				chamBiDo((BiDo)a);
		}
	}
	
	private void chamBiVang(BiVang biVang){
		Gdx.app.log("sdf", "vang");
	}
	private void chamBiDo(BiDo biDo){
		Gdx.app.log("sdf", "do");
		this.setChay(false);
		for (Actor a : groupBi.getGroupBiMau().getChildren())
				((BiBase) a).setChay(false);
		groupBi.getPlayScreen().getLeftTaskBar().endGame();
		PlayScreen.PAUSE_GAME = true;
		groupBi.getPlayScreen().showKetQua();
	}
	private void chamBiXanh(BiXanh biXanh){
		Gdx.app.log("sdf", "xanh");
		biXanh.doiViTri();
		BiDo biDo = new BiDo(groupBi);
		groupBi.getGroupBiMau().addActor(biDo);
		groupBi.getPlayScreen().getLeftTaskBar().biXamAnBiXanh();
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		if (PlayScreen.PAUSE_GAME == false)
			checkCollision(groupBi.getGroupBiMau());
	}

	@Override
	public void myAct() {
		super.myAct();
		diChuyen();
	}
}
