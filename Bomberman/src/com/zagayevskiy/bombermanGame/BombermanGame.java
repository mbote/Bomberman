package com.zagayevskiy.bombermanGame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;

public class BombermanGame implements ApplicationListener {
	@Override
	public void create() {
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {
		Gdx.gl20.glClearColor(0.0f, 0.7f, 0.0f, 1.0f);
		Gdx.gl20.glClear(GL10.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
