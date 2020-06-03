package Polymorphism;

public class Vehicle {
	//Private instance Variables++++++++++++++++++++
	private int numWheels = 4;
	private int numDoors = 2;
	private String  colour;
	private String make;
	private String model;
	private String year;
	private float speed;
	private final int MAX_SPEED = 40;//final means fixed value
	
	//Getters and setters++++++++++++++++++++
	public int getNumDoors() {
		return this.numDoors;
	}
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	public int getNumWheels() {
		return this.numWheels;
	}
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	public String getColour() {
		return this.colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return this.year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public float getSpeed() {
		return this.speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public int getMAX_SPEED() {
		return MAX_SPEED;
	}
	
	//constructor++++++++++++++++++++++
	public Vehicle(String colour, String year, String model, String make, int speed) {
		this.setSpeed(speed);
		this.setColour(colour);
		this.setYear(year);
		this.setModel(model);
		this.setMake(make);
		getNumWheels();
		getNumDoors();
	}
	
	//Public methods++++++++++++++++++++++++++++++++++
	public void accelerate() {
		this.speed += 4;
		if(this.speed >= this.MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}
	public void Decelerate() {
		this.speed -= 6;
		if(this.speed <0) {
			this.speed = 0;
		}
	}
	
	public void turnLeft() {
		System.out.println("turning left");
	}
	
	public void turnRight() {
		System.out.println("turning Right");
	}
	
}
