package com.vn.gombi.screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.vn.gombi.screen.play.BangKetQua;
import com.vn.gombi.screen.play.BottomTaskBar;
import com.vn.gombi.screen.play.GroupBi;
import com.vn.gombi.screen.play.KhungGame;
import com.vn.gombi.screen.play.LeftTaskBar;
import com.vn.gombi.screen.play.NenGach;

public class PlayScreen extends BaseScreen {

	private NenGach nenGach;
	private KhungGame khungGame;
	private LeftTaskBar leftTaskBar;
	private GroupBi groupBi;
	private BangKetQua bangKetQua;
	private BottomTaskBar bottomTaskBar;
	
	public static boolean PAUSE_GAME = false;

	@Override
	public void show() {
		super.show();

		nenGach = new NenGach(this);
		stage.addActor(nenGach);

		khungGame = new KhungGame();
		stage.addActor(khungGame);

		leftTaskBar = new LeftTaskBar();
		stage.addActor(leftTaskBar);

		groupBi = new GroupBi(this);
		stage.addActor(groupBi);

		bottomTaskBar = new BottomTaskBar(this);
		stage.addActor(bottomTaskBar);

	}

	public void showKetQua() {
		bangKetQua = new BangKetQua(leftTaskBar.getScore(),
				leftTaskBar.getColection());
		stage.addActor(bangKetQua);
	}

	public LeftTaskBar getLeftTaskBar() {
		return leftTaskBar;
	}
	
	public GroupBi getGroupBi(){
		return groupBi;
	}
	
	public BottomTaskBar getBottomTaskBar(){
		return bottomTaskBar;
	}
	
	public SpriteBatch getSpriteBatch(){
		return sb;
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void hide() {
		super.hide();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void render(float arg0) {
		super.render(arg0);
	}

	@Override
	public void resize(int arg0, int arg1) {
		super.resize(arg0, arg1);
	}

	@Override
	public void resume() {
		super.resume();
	}
}
