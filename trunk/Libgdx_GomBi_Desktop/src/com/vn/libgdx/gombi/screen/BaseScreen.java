package com.vn.libgdx.gombi.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.vn.libgdx.gombi.gamelogic.GameControl;

public class BaseScreen implements Screen{
	public OrthographicCamera camera;
	protected SpriteBatch sb;
	protected Stage stage;
	
	
	@Override
	public void show() {
		sb = new SpriteBatch();
		stage = new Stage(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), true);
		Gdx.input.setInputProcessor(stage);
		camera = (OrthographicCamera) stage.getCamera();
	}
	
	@Override
	public void render(float arg0) {
		Gdx.gl.glClearColor(0.5f, 0.6f, 0.5f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		sb.setProjectionMatrix(camera.combined);
		camera.update();
		stage.act();
		stage.draw();
	}
	


	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}



	@Override
	public void resize(int arg0, int arg1) {
		stage.setViewport(arg0, arg1, true);
	}

	@Override
	public void resume() {
		
	}
	
	@Override
	public void dispose() {
		sb.dispose();
		stage.draw();
	}
}
