package fr.dubois.space.invader;

import java.util.ArrayList;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Wave{

	Bitmap bitmap;
	ArrayList<Alien> liste_alien;
	
	public Wave(Bitmap bitmap) {
		bitmap = this.bitmap;
		for(Alien alien: liste_alien){
			alien = new Alien(bitmap, 0, 0);
		}
	}
	
	public void draw(Canvas canvas) {
		for(Alien alien: liste_alien){
			canvas.drawBitmap(bitmap, alien.x, alien.y, alien.paint);
		}
	}
	
	public void act() {
		for(Alien alien: liste_alien){
			if(alien.direction){
				if(alien.x >= 550){
					alien.direction = false;
					alien.y = alien.y + 20;
				}
				else	alien.x = alien.x + 10;
			}else{
				if(alien.x <= 0){
					alien.direction = true;
					alien.y = alien.y + 20;
				}
				else	alien.x = alien.x - 10;
			}
		}
	}
}