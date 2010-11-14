package com.nc.reminder.draw;


public class Point {
	
	private float x, y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x + ", " + y;
	}

	public float getX(){
		return x;
	}
	
	public float getY(){
		return y;
	}
}

