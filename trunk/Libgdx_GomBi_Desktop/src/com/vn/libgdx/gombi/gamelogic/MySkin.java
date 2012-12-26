package com.vn.libgdx.gombi.gamelogic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class MySkin extends Skin{

	public MySkin() {
		super(Gdx.files.internal("MyDataPacker/uiskin.json"), 
				new TextureAtlas(Gdx.files.internal("MyDataPacker/MoTa.txt")));
	}
	//test
}
