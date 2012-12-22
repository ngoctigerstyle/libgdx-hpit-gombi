package com.vn.libgdx.mygame.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.vn.libgdx.mygame.gamelogic.MyGdxGame;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "MyGdxGame";
		cfg.useGL20 = false;
		cfg.width = 800;
		cfg.height = 480;
		new LwjglApplication(new MyGdxGame(), cfg);
	}
}
