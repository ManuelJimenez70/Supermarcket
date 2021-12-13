package models;

import java.util.ArrayList;
import java.util.Random;

public class Cliente {

	private ArrayList<Producto> products;
	
	public Cliente() {
		Random r = new Random();
		int prctNum = r.nextInt(20);
		products = new ArrayList<Producto>();
		for (int i = 0; i < prctNum; i++) {
			products.add(new Producto());
		}
	}

	public ArrayList<Producto> getProducts() {
		return products;
	}
	
	public int getProductSize() {
		return this.products.size();
	}
}
