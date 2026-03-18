package practicando_uml_poo;
import java.util.ArrayList;
import java.util.Date;

public class Order {
	private Date date;
	private Customer customer;
	private OrderStatus status;
	private ArrayList<OrderDetail> details;
	private ArrayList<Payment> payments;
	
	public Order(Customer customer) {
		this.date = new Date();
		this.customer = customer;
		this.status = OrderStatus.CREATE;
		this.details = new ArrayList<OrderDetail>();
		this.payments = new ArrayList<Payment>();
	}
	
}
