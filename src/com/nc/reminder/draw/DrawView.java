package com.nc.reminder.draw;

import java.util.ArrayList;
import java.util.List;

import com.nc.reminder.dialog.ColorPicker.OnColorChangedListener;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;

public class DrawView extends SurfaceView implements OnTouchListener, OnColorChangedListener {

	private static final String TAG = DrawView.class.getSimpleName();

	private List<Point> points;
	private Paint paint;
	private SurfaceHolder surfaceHolder;

	/**
	 * Constructor por defecto
	 * 
	 * @param context
	 */
	public DrawView(Context context) {
		super(context);

		// opciones
		setFocusable(true);
		setFocusableInTouchMode(true);
		requestFocus();

		// marco esta clase como listener
		setOnTouchListener(this);

		// contiene el acceso a los recrustos del surface view
		surfaceHolder = getHolder();

		// lista de puntos
		points = new ArrayList<Point>();

		// paint
		paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		paint.setColor(Color.WHITE);
		paint.setStrokeWidth(5);

	}

	/**
	 * onTouch propio de la view
	 */
	@Override
	public boolean onTouch(View view, MotionEvent event) {
		Log.d(TAG, "onTouch");
		switch (event.getAction()) {
		case MotionEvent.ACTION_UP:
			points.add(new End(event.getX(), event.getY()));
			break;
		default:
			points.add(new Point(event.getX(), event.getY()));
			break;
		}

		repaint();
		return true;
	}

	/**
	 * Gestiona el color que hemos selecionado y lo cambia en el Paint
	 */
	@Override
	public void colorChanged(int color) {
		paint.setColor(color);
	}

	/**
	 * retorna el color actual del paint
	 * 
	 * @return
	 */
	public int currentColor() {
		return paint.getColor();
	}

	/**
	 * Realiza las funciones de onDraw evitando hacer uso del invalidate()
	 * 
	 * @param canvas
	 */
	private void paint(Canvas canvas) {
		Log.d(TAG, "paint(" + points.size() + ")");
		int i = 0;
		int size = points.size();
		while (size > 0 && i < size) {
			Point point = points.get(i);
			if (!(point instanceof End)) {
				canvas.drawCircle(point.getX(), point.getY(), 2, paint);
			}
			int j = i + 1;
			if (j < size && !(point instanceof End)) {
				Point next = points.get(j);
				canvas.drawLine(point.getX(), point.getY(), next.getX(), next.getY(), paint);
			} else {

			}
			i++;
		}
		if (size > 2) {
			points.remove(0);
		}
	}

	/**
	 * Gestiona el repintado usando el holder
	 */
	private void repaint() {
		Canvas canvas = null;
		try {
			canvas = surfaceHolder.lockCanvas();
			if (canvas != null) {
				paint(canvas);
			}
		} finally {
			if (canvas != null) {
				surfaceHolder.unlockCanvasAndPost(canvas);
			}
		}
	}

}