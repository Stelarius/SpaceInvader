package fr.dubois.space.invader;

import android.graphics.Bitmap;

public class Alien extends Sprite {
	
	boolean direction;
	Wave vague;
	
	public Alien(Bitmap bitmap, float x, float y, Wave vague) {
		super(bitmap, x, y);
		direction = true;
		this.vague = vague;
	}
	
	@Override
	public void act() {
		if(direction){
			if(x >= 500){
				direction = false;
				y += 40;
			} else	x += 10;
		} else {
			if(x <= 50){
				direction = true;
				y += 40;
			} else	x -= 10;
		}
	}
}