package com.vn.libgdx.gombi.screen.play.bi;

import java.util.Random;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.screen.play.GroupBi;

public class BiBase extends Group{

	protected boolean bChay;
	protected Image image;
	protected float x_max;
	protected float y_max;
	
	public BiBase() {
		super();
		bChay = true;
	}
	
	public void setChay(boolean b){
		bChay = b;
	}
	
	public Image getImage(){
		return image;
	}
	
	public void myAct(){
		
	}
	
	public void setXY_Image(float x, float y){
		image.setX(x);
		image.setY(y);
	}
	
	public void setX_Image(float x){
		image.setX(x);
	}
	
	public void setY_Image(float y){
		image.setY(y);
	}
	
	public float getX_Image(){
		return image.getX();
	}
	
	public float getY_Image(){
		return image.getY();
	}
	
	public void incX(int x){
		this.setX_Image(this.getX_Image() + x);
	}
	
	public void incY(int y){
		this.setY_Image(this.getY_Image() + y);
	}
	
	public void desX(int x){
		this.setX_Image(this.getX_Image() - x);
	}
	
	public void desY(int y){
		this.setY_Image(this.getY_Image() - y);
	}
	
	public void randomViTri(){
		Random r = new Random();
		image.setX(r.nextInt(GroupBi.WIDTH - (int)image.getWidth()));
		image.setY(r.nextInt(GroupBi.HEIGH - (int)image.getHeight()));
	}
	
	public void setXY_Max(){
		if (image != null){
			x_max = GroupBi.WIDTH - image.getWidth();
			y_max = GroupBi.HEIGH - image.getHeight();
		}
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		if (bChay == true)
			myAct();
	}
	
}
