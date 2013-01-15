package com.vn.gombi.helper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.vn.gombi.constant.Constant;

public class MyInput {
	private static boolean daNhan = false;
	private static int keyDangXuLy = Keys.UNKNOWN;

	public static boolean pressKey(int newKey) {
		if (Gdx.input.isKeyPressed(newKey) && (daNhan != true)) {
			daNhan = true;
			keyDangXuLy = newKey;
			return true;
		}
		if (Gdx.input.isKeyPressed(keyDangXuLy) == false) {
			daNhan = false;
		}
		return false;
	}
	
	public static boolean wrapButton(TextButton tB){
		Vector2 v2 = new Vector2();
		tB.localToStageCoordinates(v2);
		
		float scaleX = Gdx.graphics.getWidth() / Constant.STAGE_WIDTH;
		float scaleY = Gdx.graphics.getHeight() / Constant.STAGE_HEIGHT;
		
		float xButton = v2.x * scaleX;
		float yButton = v2.y * scaleY;
		float wButton = tB.getWidth() * scaleX;
		float hButton = tB.getHeight() * scaleY;
		
		float xTouch = Gdx.input.getX();
		float yTouch = Gdx.graphics.getHeight() - Gdx.input.getY();
		
		
		if (((xTouch > xButton) & (xTouch < xButton + wButton))
				&(yTouch > yButton) & (yTouch < yButton + hButton))
			return true;
		else
			return false;
	}
}
