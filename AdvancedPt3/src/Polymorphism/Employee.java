package Polymorphism;

public abstract class Employee {
//Abstract Class
	// Abstract classes are never instantiated. but they force their subclasses to have the variables, building internal structure
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;	
		this.lastName = lastName;
		this.socialSecurityNumber	= socialSecurityNumber;
	}

	
	//getters
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	//how to return a String representation of employee object
	@Override
	
	public String toString() {
		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	//abstract method must be overridden by concrete subclasses
	
	public abstract double earnings();//no implementations, will be made in subclasses
	
	
}
