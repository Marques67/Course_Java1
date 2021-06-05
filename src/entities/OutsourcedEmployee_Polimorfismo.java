package entities;

public class OutsourcedEmployee_Polimorfismo extends Employee_Polimorfismo {

	private Double additionalCharge;
	
	public OutsourcedEmployee_Polimorfismo() {
		super();
	}

	public OutsourcedEmployee_Polimorfismo(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
