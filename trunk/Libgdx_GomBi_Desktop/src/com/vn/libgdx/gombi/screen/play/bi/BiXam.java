package com.vn.libgdx.gombi.screen.play.bi;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.vn.libgdx.gombi.gamelogic.GameControl;
import com.vn.libgdx.gombi.screen.play.GroupBi;

public class BiXam extends BiBase{

	private GroupBi groupBi;
	private static int X_DEFAULT = 158;
	private static int Y_DEFAULT = 58;
	private Vector2 viTriCuoi;
	private int iTocDo;
	
	public BiXam(GroupBi groupBi) {
		super();
		this.groupBi = groupBi;
		image = new Image(GameControl.getAtlas().findRegion("play/bi/xam"));
		image.setX(X_DEFAULT);
		image.setY(Y_DEFAULT);
		this.addActor(image);
		setXY_Max();
		viTriCuoi = new Vector2(image.getX(), image.getY());
		dieuKhien();
		iTocDo = 4;
	}
	
	public void dieuKhien(){
		ClickListener click = new ClickListener(){

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				setViTriCuoi(x, y);
//				Gdx.app.log("sdf", "arg1");
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
	
	private void setViTriCuoi(float x, float y){
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
		//Gdx.app.log(String.valueOf(viTriCuoi.x), String.valueOf(viTriCuoi.y));
	}
	
	private void diChuyen(){
		if (viTriCuoi.x > this.getX_Image() + iTocDo)
			this.incX(iTocDo);
		if (viTriCuoi.x < this.getX_Image() - iTocDo)
			this.desX(iTocDo);
		if (viTriCuoi.y > this.getY_Image() + iTocDo)
			this.incY(iTocDo);
		if (viTriCuoi.y < this.getY_Image() - iTocDo)
			this.desY(iTocDo);
	}

	@Override
	public void act(float arg0) {
		super.act(arg0);
	}

	@Override
	public void myAct() {
		super.myAct();
		diChuyen();
	}	
}
