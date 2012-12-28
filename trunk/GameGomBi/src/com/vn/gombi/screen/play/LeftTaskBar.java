package com.vn.gombi.screen.play;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.vn.gombi.gamelogic.GameControl;

public class LeftTaskBar extends Group {

	private int iScore;
	private int iColection;

	private Label lScore2;
	private Label lCollect2;
	private Label lScore;
	private Label lCollect;
	private Label lPower;
	private Label lPower2;

	public LeftTaskBar() {
		super();
		khoiTaoNumber();
		khoiTaoLabel();
	}

	private void khoiTaoNumber() {
		iScore = 0;
		iColection = 0;
	}

	public int getScore() {
		return iScore;
	}

	public int getColection() {
		return iColection;
	}

	public void endGame() {
		removeKetQua();
	}

	private void removeKetQua() {
		lScore.remove();
		lScore2.remove();
		lCollect.remove();
		lCollect2.remove();
		lPower.remove();
		lPower2.remove();
	}

	private void khoiTaoLabel() {
		Image imgLogo = new Image(GameControl.getAtlas().findRegion(
				"menu/ball-text"));
		imgLogo.setX(15);
		imgLogo.setY(420);
		imgLogo.setWidth(80);
		imgLogo.setHeight(30);
		this.addActor(imgLogo);

		lScore = new Label("Score:", GameControl.getMySkin(), "default");
		lScore.setX(5);
		lScore.setY(380);
		this.addActor(lScore);

		lScore2 = new Label(String.valueOf(iScore), GameControl.getMySkin(),
				"default");
		lScore2.setColor(Color.YELLOW);
		lScore2.setX(85);
		lScore2.setY(lScore.getY());
		this.addActor(lScore2);

		lCollect = new Label("Colection:", GameControl.getMySkin(), "default");
		lCollect.setX(lScore.getX());
		lCollect.setY(lScore.getY() - 30);
		this.addActor(lCollect);

		lCollect2 = new Label(String.valueOf(iColection),
				GameControl.getMySkin(), "default");
		lCollect2.setX(lScore2.getX());
		lCollect2.setColor(Color.YELLOW);
		lCollect2.setY(lCollect.getY());
		this.addActor(lCollect2);

		lPower = new Label("Power:", GameControl.getMySkin(), "default");
		lPower.setX(lScore.getX());
		lPower.setY(lScore.getY() - 60);
		this.addActor(lPower);

		lPower2 = new Label("None", GameControl.getMySkin(), "default");
		// lNangLuong2.setFontScaleY(0.7f);
		lPower2.setColor(Color.RED);
		lPower2.setX(lScore.getX());
		lPower2.setY(lPower.getY() - 20);
		this.addActor(lPower2);
	}
	
	public void setLabelPower(String sPower){
		lPower2.setText(sPower);
	}
	
	public void resetLabelPower(){
		lPower2.setText("none");
	}

	public void biXamAnBiXanh() {
		incScore();
		incCollection();
	}

	private void incScore() {
		iScore += 5;
		lScore2.setText(String.valueOf(iScore));
	}

	private void incCollection() {
		iColection++;
		lCollect2.setText(String.valueOf(iColection));
	}
}
