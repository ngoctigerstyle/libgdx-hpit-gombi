package com.vn.gombi.constant;

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
}
