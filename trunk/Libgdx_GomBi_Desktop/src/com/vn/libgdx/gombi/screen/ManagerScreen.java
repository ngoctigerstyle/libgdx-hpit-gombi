package com.vn.libgdx.gombi.screen;

import com.badlogic.gdx.Screen;

public class ManagerScreen {
	
	public static int SCREEN_MENU = 0;
	public static int SCREEN_PLAY = 1;
	
	private Screen nowScreen;
	
	public ManagerScreen() {
	}
	
	public Screen getScreen(){
		if (nowScreen == null)
			nowScreen = new MenuScreen();
//		nowScreen.show();
		return nowScreen;
	}
	
	public Screen createScreen(int select){
		switch (select) {
		case 0:
			clearNowScreen();
			nowScreen = new MenuScreen();
//			nowScreen.show();
			return nowScreen;
		case 1:
			clearNowScreen();
			nowScreen = new PlayScreen();
//			nowScreen.show();
			return nowScreen;
		}
		return new MenuScreen();
	}
	
	private void clearNowScreen(){
		if (nowScreen != null)
			nowScreen.dispose();
	}
}
