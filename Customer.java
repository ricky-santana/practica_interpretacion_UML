package practicando_uml_poo;

import java.util.ArrayList;

public class Customer {
	private String name;
	private String deliveryAddress;
	private String contact;
	private boolean active;
	private ArrayList<Order> orders;
	
	public Customer(String name, String deleveryAddress, String contact) {
		this.name = name;
		this.deliveryAddress = deleveryAddress;
		this.contact = contact;
		this.active = true;
		this.orders = new ArrayList<Order>();
	}
	
}
