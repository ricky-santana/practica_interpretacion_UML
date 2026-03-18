package practicando_uml_poo;

public class Cash extends Payment{
	private float cashTendered;

	public Cash(float amount, float cashTendered) {
		super(amount);
		this.cashTendered = cashTendered;
	}

}
