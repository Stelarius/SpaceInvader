package fr.dubois.space.invader;

import android.graphics.Bitmap;

public class Alien extends Sprite {
	
	boolean direction = true; 		// false = gauche , true = droite
	
	public Alien(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(direction){
			if(x >= 550){
				direction = false;
				y = y + 20;
			}
			else	x = x + 10;
		}else{
			if(x <= 0){
				direction = true;
				y = y + 20;
			}
			else	x = x - 10;
		}
	}
}