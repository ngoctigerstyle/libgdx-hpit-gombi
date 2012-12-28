package com.vn.gombi.screen.play.bi;

import java.util.Random;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.screen.PlayScreen;
import com.vn.gombi.screen.play.GroupBi;

public class BiDo extends BiBase {

	private boolean bHuong;
	private boolean bPhuong;
	private int iSpeed = 2;
	private int iSpeedBackUp = iSpeed;

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
		iSpeed = r.nextInt(3) + 1;
	}
	
	public void incSpeed(){
		iSpeed++;
	}
	
	public void desSpeed(){
		iSpeed--;
	}
	
	public void resetSpeed(){
		iSpeed = iSpeedBackUp;
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		if (PlayScreen.PAUSE_GAME == false)
			move();
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

	private void move(){
		if (bPhuong == false)
			if (bHuong == false) {
				this.setX(this.getX() + iSpeed);
				if (this.getX() > x_max)
					bHuong = true;
			} else {
				this.setX(this.getX() - iSpeed);
				if (this.getX() < 0)
					bHuong = false;
			}

		if (bPhuong == true) {
			if (bHuong == false) {
				this.setY(this.getY() + iSpeed);
				if (this.getY() > y_max)
					bHuong = true;
			} else {
				this.setY(this.getY() - iSpeed);
				if (this.getY() < 0)
					bHuong = false;
			}
		}

	}
}
