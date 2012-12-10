package fr.dubois.space.invader;

import android.graphics.Bitmap;

public class Missile extends Sprite {
	
	float vx;
	float vy;

	public Missile(Bitmap bitmap, float x, float y, float vx, float vy) {
		super(bitmap, x, y);
		this.vx = vx;
		this.vy = vy;
		// TODO Auto-generated constructor stub
	}
	
	public void act(){
		this.x -= this.vx;
		this.y -= this.vy;
	}
}
