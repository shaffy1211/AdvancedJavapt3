package Polymorphism;

public class Truck extends Vehicle {
	
	//constructors++++++++++++++++++++++++++++++++++

	public Truck(String colour, String year, String model, String make, int speed) {
		super(colour, year, model, make, speed);
		checkNumDoors();
	}
	//private methods++++++++++++++++++++++++++++++
	private void checkNumDoors() {
		if(this.numDoors <3) {
			this.numDoors = 3;
		}
	}
	
	//OVERRIDDEN PUBLIC METHODS+++++++++++++++++++++++++++
	@Override
	public void accelerate() {
		this.speed += 2;
		if(this.speed>=this.MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}
	
	@Override
	public void Decelerate() {
		this.speed -= 2;
		if(this.speed<0) {
			this.speed = 0;
		}
	}//polymorphism allows inheritance + overriding

}
