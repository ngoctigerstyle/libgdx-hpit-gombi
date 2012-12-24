package com.vn.libgdx.gombi.helper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Input {
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
}
