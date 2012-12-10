package fr.dubois.space.invader;

import android.graphics.Bitmap;

public class Ship extends Sprite {
	
	static int VITESSE = 5;
	private float valeur_cible;
	
	public Ship(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
		setValeur_cible(this.x);
		// TODO Auto-generated constructor stub
	}
	
	public void act(){
		if(valeur_cible != this.x){
			float x_minimal = this.x - VITESSE;
			float x_maximal = this.x + VITESSE;
			if(valeur_cible < x_minimal){
				this.x = x_minimal;
			} else if(valeur_cible > x_maximal)	{
				this.x = x_maximal;
			} else {
				this.x = valeur_cible;
			}
		}
	}

	public void setValeur_cible(float valeur_cible) {
		this.valeur_cible = valeur_cible - (bitmap.getWidth() / 2);
	}
}
