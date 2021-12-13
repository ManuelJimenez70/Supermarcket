package models;

import java.util.ArrayList;

public class Supermercado {
	
	private Caja caja1,caja2;
	
	
	public Supermercado() {
		this.caja1 = new Caja("Caja 1");
		this.caja2 = new Caja("Caja 2");
	}
	
	public void attentClients(int clientsNum) throws InterruptedException {
		ArrayList<Cliente> clients = new ArrayList<>();
		for (int i = 0; i < clientsNum; i++) {
			clients.add(new Cliente());
		}
		synchronized (clients) {
			for (int i = 0; i < clients.size(); i++) {
				caja1.attendClient(clients.get(i));
				clients.remove(i);
				caja2.attendClient(clients.get(i));
				clients.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Supermercado s = new Supermercado();
		try {
			s.attentClients(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
