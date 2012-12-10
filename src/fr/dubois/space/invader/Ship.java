package fr.dubois.space.invader;

import android.graphics.Bitmap;

public class Ship extends Sprite {
	
	static int VITESSE = 5;
	
	public Ship(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void act(){
	}
	
	public void act(float valeur_cible){
		float x_minimal = this.x - VITESSE;
		float x_maximal = this.x + VITESSE;
		if(valeur_cible < x_minimal)	this.x = x_minimal;
		else if(valeur_cible > x_maximal)	this.x = x_maximal;
		else if(x_minimal < valeur_cible && valeur_cible < x_maximal) this.x = valeur_cible;
	}
}
