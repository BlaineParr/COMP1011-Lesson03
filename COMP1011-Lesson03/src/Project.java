/**
 * 
 */

/**
 * @author Blaine Parr
 * Program Description: Demo files for COMP1011 Lesson 03
 * @version 0.2 - Added Vehicle class
 */
public class Project 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SportsUtilityVehicle myHonda = new SportsUtilityVehicle("Black", "Honda", "Pilot", "2015");
		Truck myFord = new Truck(6, 3, "White", "Ford", "FX", "2008");
		
		//for loop to simulate accelerating for 10 seconds
		for(int i = 0; i < 10; i++)
		{
			myHonda.accelerate();
			myFord.accelerate();
		} //for ends
		
		//print out the speed
		System.out.println("SUV Speed: " + myHonda.getSpeed());
		System.out.println("Truck Speed: " + myFord.getSpeed());
	} //method main ends

} //class Project ends