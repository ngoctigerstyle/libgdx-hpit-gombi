package com.vn.gombi.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.vn.gombi.screen.play.bi.BiXanh;

public class TestScreen extends BaseScreen {

	private BiXanh biXanh;
	ParticleEffect particleEffect;
	
	@Override
	public void show() {
		super.show();
		biXanh = new BiXanh();
		stage.addActor(biXanh);
		
		particleEffect = new ParticleEffect();
		particleEffect.load(Gdx.files.internal("MyParticle/lua2.p"), Gdx.files.internal("MyParticle"));
		particleEffect.setPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
		
		particleEffect.start();
	}

	@Override
	public void render(float arg0) {
		super.render(arg0);
		sb.begin();
		particleEffect.draw(sb, arg0);
		sb.end();
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}
