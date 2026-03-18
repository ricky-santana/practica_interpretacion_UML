package practicando_uml_poo;

import java.util.ArrayList;

public class Item {
	private float weight;
	private String description;
	private ArrayList <OrderDetail> orderDetails;
	
	public Item (float weight, String description) {
		this.weight = weight;
		this.description = description;
		this.orderDetails = new ArrayList<OrderDetail>();
	}
	public float getWeight() {
		return this.weight;
	}
	
	public float getPriceFromQuantity(int quantity) {
		float total = 0f;
		return total;
	}
}
