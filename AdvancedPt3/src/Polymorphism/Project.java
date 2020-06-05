package Polymorphism;

public class Project {

	public static void main(String[] args) {
		Vehicle myHonda = new Vehicle("black", "1997", "Honda", "pilot",10);
		Truck myFord = new Truck("White","1950","Ford", "FX",3);

		for(int seconds = 0 ; seconds<10; seconds++) {
			myHonda.accelerate();
			myFord.accelerate();
		}
		System.out.println("Vehicle Speed " +myHonda.getSpeed());
		System.out.println("Truck Speed " +myFord.getSpeed());
		//polymorphism allow to "program in general" rather than "program in the specific"
		//enables you to write programs that process objects that share the same superclass as if they were all objects of the same superclass==> simplifies programming
		//when superclass calls a variable from subclass, the method invoked will be from the subclass i .e downcasting
		SalariedEmployee newEmployee = new SalariedEmployee("Jane", "Dorsey", "211231", 1500.00);
		System.out.println(newEmployee.toString());
	}

}
