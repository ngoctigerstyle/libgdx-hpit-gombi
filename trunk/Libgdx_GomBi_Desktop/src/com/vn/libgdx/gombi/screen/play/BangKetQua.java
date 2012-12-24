package com.vn.libgdx.gombi.screen.play;

import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.vn.libgdx.gombi.gamelogic.GameControl;
import com.vn.libgdx.gombi.screen.ManagerScreen;

public class BangKetQua extends Group{
	private Image nenXam;
	private TextButton tbRetry;
	private TextButton tbMainMenu;

	public BangKetQua() {
		super();
		nenXam = new Image(GameControl.getAtlas().findRegion("play/ketqua/xam-1"));
		nenXam.setWidth(800);
		nenXam.setHeight(480);
		this.addActor(nenXam);
		
		NinePatch npKhung = new NinePatch(GameControl.getAtlas().findRegion("play/ketqua/khung2"), 8,8,8,8);
		Image imgKhung = new Image(npKhung);
		imgKhung.setX(300);
		imgKhung.setY(200);
		imgKhung.setWidth(200);
		imgKhung.setHeight(280);
		this.addActor(imgKhung);
		
		tbRetry = new TextButton("Retry", GameControl.getMySkin(), "default");
		tbRetry.setWidth(100);
		tbRetry.setHeight(50);
		this.addActor(tbRetry);
		
		tbMainMenu = new TextButton("MainMenu", GameControl.getMySkin(), "default");
		tbMainMenu.setX(150);
		tbMainMenu.setWidth(100);
		tbMainMenu.setHeight(50);
		this.addActor(tbMainMenu);
		
		initClick();
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