package com.nc.reminder.activity;


import com.nc.reminder.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ReminderDrawActivity extends Activity {

	public static final String TAG = ReminderDrawActivity.class.getSimpleName();
	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.d(TAG, "onCreate");
		setContentView(R.layout.reminder_draw);

//		Intent resultValue = new Intent();
//		resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, AppWidgetManager.INVALID_APPWIDGET_ID);
//		setResult(RESULT_OK, resultValue);
//		finish();
	}

}
