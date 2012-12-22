package com.vn.libgdx.gombi.main;
//Truoc khi run MainActivity nho copy MyDataPacker tu Project Desktop bo vao assets cua Project Android.

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.vn.libgdx.gombi.gamelogic.MyGdxGame;

public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = false;
        //Add java build path project android de thay duoc MyGdxGame()
        initialize(new MyGdxGame(), cfg);
    }
}