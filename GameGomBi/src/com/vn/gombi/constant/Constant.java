package com.vn.gombi.constant;

/**
 * Truoc khi run game, phai kiem tra platform thuoc loai android hay desktop.
 * @author phuongnh
 *
 */
public class Constant {
	private static int PLATFORM = 0;
	
	private static final int DESKTOP = 0;
	private static final int ANDROID = 1;
	
	public static String PATH_TEXTUREPACKER;
	public static String PATH_SKINPACKER;
	
	private static final String PATH_TEXTUREPACKER_DESKTOP = "../GameGomBi-android/assets/MyDataPacker/MoTa.txt";
	private static final String PATH_TEXTUREPACKER_ANDROID = "MyDataPacker/MoTa.txt";
	private static final String PATH_SKINPACKER_DESKTOP = "../GameGomBi-android/assets/MySkinPacker/uiskin.json";
	private static final String PATH_SKINPACKER_ANDROID = "MySkinPacker/uiskin.json";
	
	public Constant() {
		super();
		if (PLATFORM == DESKTOP){
			PATH_TEXTUREPACKER = PATH_TEXTUREPACKER_DESKTOP;
			PATH_SKINPACKER = PATH_SKINPACKER_DESKTOP;
		}else if (PLATFORM == ANDROID){
			PATH_TEXTUREPACKER = PATH_TEXTUREPACKER_ANDROID;
			PATH_SKINPACKER = PATH_SKINPACKER_ANDROID;
		}
	}
	
	public static final int TOUCH = 0;
	public static final int ACCELEROMETER = 1;
	public static int GAME_STYLE = Constant.TOUCH;
}
