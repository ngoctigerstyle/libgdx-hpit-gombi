package com.vn.libgdx.gombi.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Gom bi - congdongandroid.vn";
		cfg.useGL20 = false;
		cfg.width = 800;
		cfg.height = 480;
		new LwjglApplication(new GameControl(), cfg);
	}
}
