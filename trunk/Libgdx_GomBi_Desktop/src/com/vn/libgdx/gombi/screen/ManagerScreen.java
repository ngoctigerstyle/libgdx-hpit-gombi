package com.vn.libgdx.gombi.screen;

import com.badlogic.gdx.Screen;

public class ManagerScreen {
	
	public static int SCREEN_MENU = 0;
	public static int SCREEN_PLAY = 1;
	
	public ManagerScreen() {
	}
	
	public Screen getScreen(int select){
		switch (select) {
		case 0:
			return new MenuScreen();
		case 1:
			return new PlayScreen();
		}
		return new MenuScreen();
	}
}
