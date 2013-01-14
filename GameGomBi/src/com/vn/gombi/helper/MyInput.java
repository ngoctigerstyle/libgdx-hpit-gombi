package com.vn.gombi.helper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

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
//		float xButton = tB.getX();
//		float yButton = tB.getY();
		float wButton = tB.getWidth();
		float hButton = tB.getHeight();
		
		float xTouch = Gdx.input.getX();
		float yTouch = Gdx.graphics.getHeight() - Gdx.input.getY();
		
		if (((xTouch > v2.x)&(xTouch < v2.x + wButton))
				&(yTouch > v2.y)&(yTouch < v2.y + hButton))
			return true;
		else
			return false;
	}
}
