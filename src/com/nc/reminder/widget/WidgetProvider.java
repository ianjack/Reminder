package com.nc.reminder.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

import com.nc.reminder.R;
import com.nc.reminder.activity.AppWidgetConfigureActivity;

public class WidgetProvider extends AppWidgetProvider {

	public static final String APP = "ReminderWidgetProvider";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.appwidget.AppWidgetProvider#onUpdate(android.content.Context,
	 * android.appwidget.AppWidgetManager, int[])
	 */
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		final int N = appWidgetIds.length;

		// Perform this loop procedure for each App Widget that belongs to this
		// provider
		for (int i = 0; i < N; i++) {
			int appWidgetId = appWidgetIds[i];

			// Actualizamos la ventana del widget
			// Create an Intent to launch ExampleActivity

			//Intent intent = new Intent(context,	ReminderAppWidgetConfigureActivity.class);
			//PendingIntent pendingIntent = PendingIntent.getActivity(context, 0,	intent, 0);

			//RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.reminder_appwidget);
//			views.setOnClickPendingIntent(R.id.b, pendingIntent)
//			AppWidgetManager manager = AppWidgetManager.getInstance(context);
			//appWidgetManager.updateAppWidget(R.layout.reminder_appwidget, views);
			
		}
		// ComponentName streetInfoWidget = new ComponentName(context,
		// StreetInfoWidget.class);
		// AppWidgetManager manager = AppWidgetManager.getInstance(context);
		//
		// manager.updateAppWidget(streetInfoWidget, widgetView);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.appwidget.AppWidgetProvider#onDeleted(android.content.Context,
	 * int[])
	 */
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		// usado cuando se elimina la widget
		super.onDeleted(context, appWidgetIds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.appwidget.AppWidgetProvider#onEnabled(android.content.Context)
	 */
	@Override
	public void onEnabled(Context context) {
		// cuando se crea la widget por primera vez en la pantalla (por cada
		// una)
		super.onEnabled(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.appwidget.AppWidgetProvider#onDisabled(android.content.Context)
	 */
	@Override
	public void onDisabled(Context context) {
		// cuando se borran todas las instancias de la widget
		super.onDisabled(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.appwidget.AppWidgetProvider#onReceive(android.content.Context,
	 * android.content.Intent)
	 */
	@Override
	public void onReceive(Context context, Intent intent) {
		// cuando se alguna dependiendo de los broadcast
		super.onReceive(context, intent);
	}
}
