/**
 * This program will construct a car to have
 * Student Name: Dustin Wleczyk
 * Submission Time: 5:20 pm
 * Paws ID: dwlecz1
 * 
 * 
 * 
 * @source 1/28/2021
 * @author dustin251
 *
 */





public class CarsProject {

	public static void main(String[] args) {
		
		//Car objects created
		
		Car c1 = new Car(12313131, 2009, "Camry");
		c1.setMileage(60000);
		System.out.println(c1.getInfo());
		
		Car c2 = new Car(95645421, 2010, "Accord");
		c2.setMileage(95000);
		System.out.println(c2.getInfo());
		
		Car c3 = new Car(45746587, 2019, "CX5");
		c3.setMileage(600);
		System.out.println(c3.getInfo());
		

	}

}
