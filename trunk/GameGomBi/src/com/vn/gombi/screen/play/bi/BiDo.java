package com.vn.gombi.screen.play.bi;

import java.util.Random;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.screen.play.GroupBi;

public class BiDo extends BiBase {

	private boolean bHuong;
	private boolean bPhuong;
	private int iTocDo = 2;

	private GroupBi groupBi;

	public BiDo(GroupBi groupBi) {
		super();
		textureRegionDrawable.setRegion(GameControl.getAtlas().findRegion(
				"play/bi-do"));
		this.setDrawable();
		this.groupBi = groupBi;
		randomViTri();
		setXY_Max();
		randomPhuong();// chay ngang hay doc
		randomTocDo();
		bHuong = false;// chay toi hay lui
	}

	public void randomPhuong() {
		Random r = new Random();
		bPhuong = r.nextBoolean();
	}

	public void randomTocDo() {
		Random r = new Random();
		iTocDo = r.nextInt(3) + 1;
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		// Gdx.app.log(String.valueOf(bPhuong), String.valueOf(bHuong));
	}

	@Override
	public void randomViTri() {
		super.randomViTri();
		if ((getX() < groupBi.getBiXam().getX() + 5)
				&& (getX() > groupBi.getBiXam().getX() - 5))
			incX(10);

		if ((getY() < groupBi.getBiXam().getY() + 5)
				&& (getY() > groupBi.getBiXam().getY() - 5))
			incY(10);
	}

	@Override
	public void myAct() {
		super.myAct();
		if (bPhuong == false)
			if (bHuong == false) {
				this.setX(this.getX() + iTocDo);
				if (this.getX() > x_max)
					bHuong = true;
			} else {
				this.setX(this.getX() - iTocDo);
				if (this.getX() < 0)
					bHuong = false;
			}

		if (bPhuong == true) {
			if (bHuong == false) {
				this.setY(this.getY() + iTocDo);
				if (this.getY() > y_max)
					bHuong = true;
			} else {
				this.setY(this.getY() - iTocDo);
				if (this.getY() < 0)
					bHuong = false;
			}
		}
	}
}
