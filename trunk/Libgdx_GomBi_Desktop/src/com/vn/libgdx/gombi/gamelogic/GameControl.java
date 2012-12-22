package com.vn.libgdx.gombi.gamelogic;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.vn.libgdx.gombi.screen.ManagerScreen;
import com.vn.libgdx.gombi.screen.MenuScreen;

public class GameControl extends Game{
	private ManagerScreen managerScreen;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	@Override
	public void create() {
		managerScreen = new ManagerScreen();
		//example load 1 tam hinh.
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("MyDataPacker/FileMoTa.txt"));
		TextureRegion region = new TextureRegion(atlas.findRegion("hinh1/badlogic"));
		
		sprite = new Sprite(region);
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
		this.setScreen(new MenuScreen());
	}



	@Override
	public void render() {
		Gdx.gl.glClearColor(0.5f, 0.6f, 0.5f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		//sprite.draw(batch);
		batch.end();
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
		//texture.dispose();
	}
}
