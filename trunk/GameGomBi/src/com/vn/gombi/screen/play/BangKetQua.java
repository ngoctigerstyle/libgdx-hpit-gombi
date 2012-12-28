package com.vn.gombi.screen.play;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.vn.gombi.gamelogic.GameControl;
import com.vn.gombi.screen.ManagerScreen;

public class BangKetQua extends Group{
	private Image nenXam;
	private TextButton tbRetry;
	private TextButton tbMainMenu;
	
	private Image imgKhung;
	
	private Label lScore2;
	private Label lThuThap2;
	
	private int iScore;
	private int iColection;

	public BangKetQua(int iScore, int iColection) {
		super();
		this.iScore = 0;
		this.iColection = 0;
		init(iScore, iColection);
		initClick();
		initDiemSo();
	}
	
	private void init(int iScore, int iColection) {

		this.iScore = iScore;
		this.iColection = iColection;

		nenXam = new Image(GameControl.getAtlas().findRegion(
				"play/ketqua-xam-1"));
		nenXam.setWidth(800);
		nenXam.setHeight(480);
		this.addActor(nenXam);

		NinePatch npKhung = new NinePatch(GameControl.getAtlas().findRegion(
				"play/ketqua-khung"), 8, 8, 8, 8);
		imgKhung = new Image(npKhung);
		imgKhung.setX(300);
		imgKhung.setY(100);
		imgKhung.setWidth(200);
		imgKhung.setHeight(280);
		this.addActor(imgKhung);

		tbRetry = new TextButton("Retry", GameControl.getMySkin(), "default");
		tbRetry.setX(imgKhung.getX() + 5);
		tbRetry.setY(imgKhung.getY() + 5);
		tbRetry.setWidth(90);
		tbRetry.setHeight(40);
		this.addActor(tbRetry);

		tbMainMenu = new TextButton("MainMenu", GameControl.getMySkin(),
				"default");
		tbMainMenu.setX(imgKhung.getX() + 105);
		tbMainMenu.setY(imgKhung.getY() + 5);
		tbMainMenu.setWidth(90);
		tbMainMenu.setHeight(40);
		this.addActor(tbMainMenu);
	}
	
	private void initDiemSo(){
		Label lScore = new Label("Score:", GameControl.getMySkin(), "default");
		lScore.setX(imgKhung.getX() + 5);
		lScore.setY(350);
		this.addActor(lScore);
		
		lScore2 = new Label(String.valueOf(iScore), GameControl.getMySkin(), "default");
		lScore2.setColor(Color.YELLOW);
		lScore2.setX(imgKhung.getX() + 90);
		lScore2.setY(lScore.getY());
		this.addActor(lScore2);
		
		Label lThuThap = new Label("Colection:", GameControl.getMySkin(), "default");
		lThuThap.setX(lScore.getX());
		lThuThap.setY(lScore.getY() - 30);
		this.addActor(lThuThap);
		
		lThuThap2 = new Label(String.valueOf(iColection), GameControl.getMySkin(), "default");
		lThuThap2.setX(lScore2.getX());
		lThuThap2.setColor(Color.YELLOW);
		lThuThap2.setY(lThuThap.getY());
		this.addActor(lThuThap2);
	}
	
	private void initClick(){
		tbRetry.addListener(new ClickListener(){

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				GameControl.getManagerScreen().createScreen(ManagerScreen.SCREEN_PLAY);
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
			}
			
		});
		
		tbMainMenu.addListener(new ClickListener(){

			@Override
			public void touchUp(InputEvent arg0, float arg1, float arg2,
					int arg3, int arg4) {
				GameControl.getManagerScreen().createScreen(ManagerScreen.SCREEN_MENU);
				super.touchUp(arg0, arg1, arg2, arg3, arg4);
			}
		});
	}
}