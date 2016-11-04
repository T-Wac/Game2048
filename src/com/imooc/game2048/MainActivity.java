package com.imooc.game2048;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {
	private TextView tvScore;
	private static MainActivity mainActivity = null;
	private int score = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvScore = (TextView) findViewById(R.id.tvScore);
	}

	public MainActivity() {
		mainActivity = this;
	}

	public static MainActivity getManActivity() {

		return mainActivity;
	}

	public void clearScore() {
		score = 0;
		showScore();
	}

	public void showScore() {
		tvScore.setText(score + "");
	}
	public void addScore(int s){
		score+=s;
		showScore();
	}
}
