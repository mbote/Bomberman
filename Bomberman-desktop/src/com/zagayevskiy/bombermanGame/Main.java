package com.zagayevskiy.bombermanGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Bomberman";
		cfg.useGL20 = true;
		cfg.width = 600;
		cfg.height = 600;
		
		new LwjglApplication(new BombermanGame(), cfg);
	}
}
