package com.vn.gombi.helper;

/**Su dung:
 *Chuot phai vao MyTTPacker
 *Run as java application de pack hinh anh tu MyData sang MyDataPacker
 * */

import com.badlogic.gdx.tools.imagepacker.TexturePacker2;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2.Settings;

public class MyTTPacker {
	public static void main(String[] args) {
		Settings tt = new Settings();
		tt.maxWidth = 1024;
		tt.minWidth = 512;
		TexturePacker2.process(tt, "../GameGomBi-android/assets/MyData/",
				"../GameGomBi-android/assets/MyDataPacker/", "MoTa.txt");
		TexturePacker2.process(tt, "../GameGomBi-android/assets/MySkin/",
				"../GameGomBi-android/assets/MySkinPacker/", "MoTa.txt");
	}
}