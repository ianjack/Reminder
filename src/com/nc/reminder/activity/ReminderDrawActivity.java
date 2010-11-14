package com.nc.reminder.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.nc.reminder.draw.DrawView;


public class ReminderDrawActivity extends Activity {

	public static final String TAG = ReminderDrawActivity.class.getSimpleName();

	private DrawView drawView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");

		// full screen
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// sin titulo
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		drawView = new DrawView(this);
		
		// agrego la vista
		setContentView(drawView);

	}

}
