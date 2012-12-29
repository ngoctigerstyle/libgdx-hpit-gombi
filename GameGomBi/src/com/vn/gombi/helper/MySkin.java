package com.vn.gombi.helper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.vn.gombi.constant.Constant;
import com.vn.gombi.gamelogic.GameControl;

public class MySkin extends Skin {

	public MySkin() {
		super( Gdx.files.internal(Constant.PATH_SKINPACKER),
				new TextureAtlas(Gdx.files.internal("MySkinPacker/MoTa.txt")));
	}
}