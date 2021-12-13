package models;

import java.util.Random;

public class Producto {
	
	public int time;
	
	public Producto() {
		Random r = new Random();
		this.time = r.nextInt(50);
	}
}
