package com.nc.reminder.activity;


import com.nc.reminder.R;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.Bundle;

public class AppWidgetConfigureActivity extends Activity {

	public static final String TAG = "ReminderAppWidgetConfigureActivity";
	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.appwidgetconfigure);

//		Intent resultValue = new Intent();
//		resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
//		setResult(RESULT_OK, resultValue);
//		finish();
	}

}
