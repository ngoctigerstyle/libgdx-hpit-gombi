package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class LeftTaskBar extends Group{

	public LeftTaskBar() {
		super();
		
		Image imgLogo = new Image(GameControl.getAtlas().findRegion("menu/ball-text"));
		imgLogo.setX(15);
		imgLogo.setY(420);
		imgLogo.setWidth(80);
		imgLogo.setHeight(30);
		this.addActor(imgLogo);
		
		Label lScore = new Label("Score:", GameControl.getMySkin(), "default");
		lScore.setX(5);
		lScore.setY(380);
		this.addActor(lScore);
		
		Label lScore2 = new Label("0", GameControl.getMySkin(), "default");
		lScore2.setColor(Color.YELLOW);
		lScore2.setX(85);
		lScore2.setY(lScore.getY());
		this.addActor(lScore2);
		
		Label lThuThap = new Label("Colection:", GameControl.getMySkin(), "default");
		lThuThap.setX(lScore.getX());
		lThuThap.setY(lScore.getY() - 30);
		this.addActor(lThuThap);
		
		Label lThuThap2 = new Label("0", GameControl.getMySkin(), "default");
		lThuThap2.setX(lScore2.getX());
		lThuThap2.setColor(Color.YELLOW);
		lThuThap2.setY(lThuThap.getY());
		this.addActor(lThuThap2);
		
		Label lNangLuong = new Label("Nang luong:", GameControl.getMySkin(), "default");
		lNangLuong.setX(lScore.getX());
		lNangLuong.setY(lScore.getY() - 60);
		this.addActor(lNangLuong);
		
		Label lNangLuong2 = new Label("None", GameControl.getMySkin(), "default");
		//lNangLuong2.setFontScaleY(0.7f);
		lNangLuong2.setColor(Color.RED);
		lNangLuong2.setX(lScore.getX());
		lNangLuong2.setY(lNangLuong.getY()-20);
		this.addActor(lNangLuong2);
	}
}
