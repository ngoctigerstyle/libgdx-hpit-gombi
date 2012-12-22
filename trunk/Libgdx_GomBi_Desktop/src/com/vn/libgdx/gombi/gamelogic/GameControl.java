package com.vn.libgdx.gombi.gamelogic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.vn.libgdx.gombi.screen.ManagerScreen;

public class GameControl extends Game{
	private ManagerScreen managerScreen;
	protected SpriteBatch batch;
	protected OrthographicCamera camera;
	@Override
	public void create() {
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		camera = new OrthographicCamera(1, h/w);
		
		
		TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("MyDataPacker/FileMoTa.txt"));
		TextureRegion region = new TextureRegion(atlas.findRegion("hinh1/badlogic"));
		
		batch = new SpriteBatch();
		managerScreen = new ManagerScreen();
	}



	@Override
	public void render() {
		Gdx.gl.glClearColor(0.5f, 0.6f, 0.5f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(camera.combined);
		
		batch.begin();
		batch.end();
		
		managerScreen.getScreen().render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void resize(int arg0, int arg1) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
	
	@Override
	public void dispose() {
		batch.dispose();
	}
}
