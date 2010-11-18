package com.nc.reminder.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.nc.reminder.R;
import com.nc.reminder.dialog.ColorPicker;
import com.nc.reminder.draw.DrawView;

public class DrawActivity extends Activity {

	public static final String TAG = DrawActivity.class.getSimpleName();

	private DrawView drawView;

	/**
	 * creaci—n de la activity
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");

		// opciones de ventana

		// full screen
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		// sin titulo
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		drawView = createDrawView(this);

		// agrego la vista
		setContentView(drawView);

	}

	/**
	 * acciones de la selecci—n de menu
	 */
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		Log.d(TAG, "onMenuItemSelected");
		boolean result = false;
		switch (item.getItemId()) {
		case R.id.line_color:
			showColorPicker();
			break;
		default:
			result = super.onMenuItemSelected(featureId, item);
			break;
		}
		return result;
	}
	
	/**
	 * crea las opciones de menu
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Log.d(TAG, "onCreateOptionsMenu");
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.drawmenu, menu);
	    return true;
	}
	
	/**
	 * Muestra el dialogo del color picker 
	 */
	private final void showColorPicker(){
		Log.d(TAG, "showColorPicker");
		ColorPicker colorPicker = new ColorPicker(this, drawView, drawView.currentColor());
		colorPicker.show();
	}

	
	private final DrawView createDrawView(Context context) {
		Log.d(TAG, "createDrawView");
		final DrawView dv = new DrawView(this);
		return dv;

	}

}
