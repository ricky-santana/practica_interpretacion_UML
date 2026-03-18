package practicando_uml_poo;

public enum OrderStatus {
	CREATE(0), 
	SHIPPING(1),
	DELIVERED(2),
	PAID(3);
	private final int value;

    OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

