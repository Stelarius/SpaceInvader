package fr.dubois.space.invader;

import java.util.ArrayList;
import java.util.Iterator;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Wave{

	Bitmap bitmap;
	ArrayList<Alien> liste_alien;
	
	public Wave(Bitmap bitmap) {
		this.bitmap = bitmap;
		liste_alien = new ArrayList<Alien>();
		liste_alien.add(new Alien(bitmap, 450, 0, this));
		liste_alien.add(new Alien(bitmap, 400, 0, this));
		liste_alien.add(new Alien(bitmap, 350, 0, this));
		liste_alien.add(new Alien(bitmap, 300, 0, this));
		liste_alien.add(new Alien(bitmap, 250, 0, this));
		liste_alien.add(new Alien(bitmap, 200, 0, this));
		liste_alien.add(new Alien(bitmap, 150, 0, this));
		liste_alien.add(new Alien(bitmap, 100, 0, this));
		liste_alien.add(new Alien(bitmap, 50, 0, this));
		liste_alien.add(new Alien(bitmap, 0, 0, this));

	}
	
	public void draw(Canvas canvas) {
		for(Alien alien: liste_alien){
			alien.draw(canvas);
			canvas.drawBitmap(alien.bitmap, alien.x, alien.y, alien.paint);
		}
	}
	
	public void act() {
		Iterator<Alien> it = this.liste_alien.iterator();
		while(it.hasNext()){
			Alien a = it.next();
			if(a.direction){
				if(a.x >= 500){
					a.direction = false;
					a.y += 40;
				} else	a.x += 10;
			} else {
				if(a.x <= 50){
					a.direction = true;
					a.y += 40;
				} else	a.x -= 10;
			}
			if(a.y > 800) it.remove();
		}
	}
	
	public boolean testMissile(Missile m){
		Iterator<Alien> it = this.liste_alien.iterator();
		while(it.hasNext()){
			Alien a = it.next();
			if(m.getBbox().intersect(a.getBbox())){
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean testShip(Ship ship){
		Iterator<Alien> it = this.liste_alien.iterator();
		while(it.hasNext()){
			Alien a = it.next();
			if(ship.getBbox().intersect(a.getBbox())){
				it.remove();
				return true;
			}
		}
		return false;
	}
}