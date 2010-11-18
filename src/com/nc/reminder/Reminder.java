package com.nc.reminder;

import android.app.Application;
import android.util.Log;

/**
 * Clase de aplicación para Reminder app.
 * 
 * @author makensi
 * 
 */
public class Reminder extends Application {
	
	public static final String TAG = Reminder.class.getSimpleName();

	// action filter
	public static final String NEW_DRAW = "com.nc.reminder.action.NEW_DRAW";

	@Override
	public void onCreate() {
		Log.d(TAG, "onCreate de Reminder");
		super.onCreate();
	}
}
