package com.nc.reminder.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

import com.nc.reminder.R;
import com.nc.reminder.Reminder;
import com.nc.reminder.activity.DrawActivity;

public class WidgetProvider extends AppWidgetProvider {

	public static final String TAG = WidgetProvider.class.getSimpleName();

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		Log.d(TAG, "onUpdate");

		// genero el intento de apertura de la actividad para dibujo
		Intent intent = new Intent(context, DrawActivity.class);
		// accion de apertura de nuevo
		intent.setAction(Reminder.NEW_DRAW);
		// ojo si defines otro tipo como broadcast no abre la widget
		PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
		
		// obtengo la vista de la widget
		RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.reminder_widget);
		// asocio el evento al boton de la widget
		views.setOnClickPendingIntent(R.id.prueba, pendingIntent);

		// actualizo la widget
		appWidgetManager.updateAppWidget(appWidgetIds, views);

	}

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d(TAG, "onReceive");
		
		String action = intent.getAction();
		if (AppWidgetManager.ACTION_APPWIDGET_ENABLED.equals(action)) { // instalacion
			Log.d(TAG, "instalaci—n de la widget");
		} else if (AppWidgetManager.ACTION_APPWIDGET_UPDATE.equals(action)) { // actualizacion
			Log.d(TAG, "actualizaci—n de la widget");
		} else { // otros casos
			Log.d(TAG, "otra actualizaci—n " + action);
		}

		super.onReceive(context, intent);
	}

	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		Log.d(TAG, "onDeleted");
		// usado cuando se elimina la widget
	}

	@Override
	public void onEnabled(Context context) {
		Log.d(TAG, "onEnabled");
		// cuando se crea la widget por primera vez en la pantalla (por cada
		// una)
	}

	@Override
	public void onDisabled(Context context) {
		Log.d(TAG, "onDisabled");
		// cuando se borran todas las instancias de la widget
	}

}
