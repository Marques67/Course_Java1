package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualInCome, Double healthExpenditures) {
		super(name, anualInCome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	double tax = 0.0;
	@Override
	public double tax() {
		if (getAnualInCome() < 20.000) {
			if (healthExpenditures > 0.0) {
				tax = (getAnualInCome() * 0.15) - (healthExpenditures * 0.5);
			}
			else {
				tax = getAnualInCome() * 0.15;
			}
		}
		else if (getAnualInCome() >= 20.000) {
			if (healthExpenditures > 0.0) {
				tax = (getAnualInCome() * 0.25) - (healthExpenditures * 0.5);
			}
			else {
				tax = getAnualInCome() * 0.25;
			}
		}
		return tax;
	}

}
