package practicando_uml_poo;

public class WireTransfer extends Payment{
	private String bankId;
	private String bankName;
	
	public WireTransfer(float amount, String bankId, String bankName) {
		super(amount);
		this.bankId = bankId;
		this.bankName = bankName;
	}
	
}
