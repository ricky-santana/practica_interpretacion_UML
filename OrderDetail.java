package practicando_uml_poo;

public class OrderDetail {
	private int quantity;
	private String taxStatus;
	private Order order;
	private Item item;
	
	public OrderDetail(int quantity, String taxStatus, Order order, Item item) {
		this.quantity = quantity;
		this.taxStatus = taxStatus;
		this.order = order;
		this.item = item;
	}
	public float calculateSubtotal() {
		float subtotal = 0f;
		return subtotal;
	}
	public float calculateWeight() {
		float weight= 0f;
		return weight;
	}
	

}
