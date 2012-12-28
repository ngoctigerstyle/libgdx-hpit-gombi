package com.vn.gombi.screen.play.bi;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.screen.play.GroupBi;

public class BiBase extends Image {

	protected boolean bChay;
	// protected Image image;
	protected float x_max;
	protected float y_max;
	protected TextureRegionDrawable textureRegionDrawable;

	public BiBase() {
		super();
		textureRegionDrawable = new TextureRegionDrawable();
	}
	
	/**
	 * My setDrawable.
	 */
	protected void setDrawable(){
		try{
			this.setDrawable(textureRegionDrawable);
			this.setWidth(textureRegionDrawable.getMinWidth());
			this.setHeight(textureRegionDrawable.getMinHeight());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setChay(boolean b) {
		bChay = b;
	}

	public float getX_ImageAverage() {
		return this.getX() + this.getWidth() / 2;
	}

	public float getX_ImageAverage2() {
		return this.getX() + this.getWidth();
	}

	public float getY_ImageAverage2() {
		return this.getY() + this.getHeight();
	}

	public float getY_ImageAverage() {
		return this.getY() + this.getHeight() / 2;
	}

	public void incX(int x) {
		this.setX(this.getX() + x);
	}

	public void incY(int y) {
		this.setY(this.getY() + y);
	}

	public void desX(int x) {
		this.setX(this.getX() - x);
	}

	public void desY(int y) {
		this.setY(this.getY() - y);
	}

	public void randomViTri() {
		Random r = new Random();
		this.setX(r.nextInt(GroupBi.WIDTH - (int) this.getWidth()));
		this.setY(r.nextInt(GroupBi.HEIGH - (int) this.getHeight()));
	}

	public void setXY_Max() {
		if (this != null) {
			x_max = GroupBi.WIDTH;
			y_max = GroupBi.HEIGH;
		}
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
	}
}