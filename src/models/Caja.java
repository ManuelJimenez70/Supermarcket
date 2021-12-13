package models;

import java.util.ArrayList;

public class Caja {

	private String name;

	public Caja(String name) {
		this.name = name;
	}

	public void attendClient(Cliente client) throws InterruptedException {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inicio de Atencion al Cliente en la Caja: " + name);
				ArrayList<Producto> productos = client.getProducts();
				System.out.println("Cantidad de productos: " + client.getProductSize());
				for (int i = 0; i < client.getProductSize(); i++) {
					System.out.println("Producto: " + i + " Tiempo: " + productos.get(i).time);
					try {
						Thread.sleep(productos.get(i).time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Finalizacion de Atencion al Cliente en la Caja: " + name);				
			}
		}).start();
	}

}
