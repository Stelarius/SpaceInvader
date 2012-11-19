package fr.dubois.space.invader;

import java.io.Console;

import android.graphics.Bitmap;

public class Alien extends Sprite {
	
	boolean direction = true; 		// false = gauche , true = droite
	int cptY = 1000;

	
	public Alien(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(direction){
			if(x >= 250) direction = false;
			else	x = x+5;
		}else{
			if(x <= 0) direction = true;
			else	x = x-5;
		}
		if(cptY > 0){
			if(cptY % 10 == 0)	y = y + 5;
			cptY--;
		}
	}
}