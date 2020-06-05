package Polymorphism;

public class SalariedEmployee extends Employee {
private double weeklySalary;
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		if(weeklySalary < 0.0) {
			throw new IllegalArgumentException("weekly salary must be > = 0");
		}
		this.weeklySalary = weeklySalary;
	}
	
	//getter for weeklysalary
	
	public double getWeeklySalary() {
		return weeklySalary;
	}


	//calculate earnings, override method earnings in abstract employee class
	@Override 
	public double earnings() {
		return getWeeklySalary();
	}

	//return string representation of salaried object
	
	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	}

}
