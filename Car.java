/*
 * 
 * This will create the blueprint for car objects
 * Student Name: Dustin Wleczyk
 * Submission Time: 
 * Paws ID: dwlecz1
 * 
 * 
 * 
 * @source 1/28/2021
 * @author dustin251
 * 
 */
public class Car {
	
	//Attributes for Car
	//Used principle of least privilege 
	private long VIN_Number;
	private String model;
	private int year;
	private double mileage;
	
	//Default constructor
	public Car() {
		
	}
	
	//Custom Constructor
	public Car(long VIN_Num, int car_year, String model_Name) {
		VIN_Number = VIN_Num;
		model = model_Name;
		year = car_year;
	}
	
	// User can set the mileage for the car
	public void setMileage(double set_The_Mileage) {
		mileage = set_The_Mileage;
	}
	
	//User can get complete info of the car
	public String getInfo() {
		return String.format("%d %s (VIN: %d, mileage: %,.1f miles)", year, model, VIN_Number, mileage);
	}

}
