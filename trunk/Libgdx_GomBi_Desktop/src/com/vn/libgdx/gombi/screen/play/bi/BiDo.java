package com.vn.libgdx.gombi.screen.play.bi;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.vn.libgdx.gombi.gamelogic.GameControl;
import com.vn.libgdx.gombi.screen.play.GroupBi;

public class BiDo extends BiBase{

	private boolean bHuong;
	private boolean bPhuong;
	private static int TOC_DO = 2;
	
	public BiDo() {
		super();
		image = new Image(GameControl.getAtlas().findRegion("play/bi/do"));
		randomViTri();
		this.addActor(image);
		setXY_Max();
		randomPhuong();//chay ngang hay doc
		bHuong = false;//chay toi hay lui
	}
	
	public void randomPhuong(){
		Random r = new Random();
		bPhuong = r.nextBoolean();
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
		//Gdx.app.log(String.valueOf(bPhuong), String.valueOf(bHuong));
		
	}
	
	
	@Override
	public void myAct() {
		super.myAct();
		if (bPhuong == false)
			if (bHuong == false){
				this.setX_Image(this.getX_Image() + TOC_DO);
				if (this.getX_Image() > x_max)
					bHuong = true;
			}
			else{
				this.setX_Image(this.getX_Image() - TOC_DO);
				if (this.getX_Image() < 0)
					bHuong = false;
			}
		
		if (bPhuong == true){
			if (bHuong == false)
			{
				this.setY_Image(this.getY_Image() + TOC_DO);
				if (this.getY_Image() > y_max)
					bHuong = true;
			}
			else{
				this.setY_Image(this.getY_Image() - TOC_DO);
				if (this.getY_Image() < 0)
					bHuong = false;
			}
		}
	}
}
