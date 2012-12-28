package com.vn.gombi.screen.play;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.tiled.TileAtlas;
import com.badlogic.gdx.graphics.g2d.tiled.TileMapRenderer;
import com.badlogic.gdx.graphics.g2d.tiled.TiledLoader;
import com.badlogic.gdx.graphics.g2d.tiled.TiledMap;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.vn.gombi.screen.PlayScreen;

public class NenGach extends Group {

	private TiledMap tiledMap;
	private TileAtlas tileAtlas;
	private TileMapRenderer tileMapRenderer;
	private PlayScreen playScreen;

	public NenGach(PlayScreen playScreen) {
		super();
		tiledMap = TiledLoader.createMap(Gdx.files
				.internal("tilemappacked/tmx-gach.tmx"));
		tileAtlas = new TileAtlas(tiledMap, Gdx.files.internal("tilemappacked"));
		tileMapRenderer = new TileMapRenderer(tiledMap, tileAtlas, 7, 5);
		this.playScreen = playScreen;
	}

	@Override
	public void act(float arg0) {
		tileMapRenderer.render(playScreen.camera);
		super.act(arg0);
	}
}