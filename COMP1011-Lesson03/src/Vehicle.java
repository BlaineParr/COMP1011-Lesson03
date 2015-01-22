/**
 * 
 */

/**
 * @author Blaine Parr
 * Class Description: Creating a vehicle class used as a superclass for all other vehicles
 */
public class Vehicle 
{
	private int numWheels = 4;
	private int numDoors = 2;
	private String colour = "";
	private String make = "";
	private String model = "";
	private String year = "";
	private float speed = 0;
	private final int MAX_SPEED = 40;
	
	//Getters------------------------------------------------------------------------------------
	/**
	 * @return the numWheels
	 */
	public int getNumWheels() 
	{
		return this.numWheels;
	} //method getNumWheels ends

	/**
	 * @return the numDoors
	 */
	public int getNumDoors() 
	{
		return this.numDoors;
	} //method getNumDoors ends
	
	/**
	 * @return the colour
	 */
	public String getColour() 
	{
		return this.colour;
	} //method getColour ends

	/**
	 * @return the make
	 */
	public String getMake() 
	{
		return this.make;
	} //method getMake ends

	/**
	 * @return the model
	 */
	public String getModel() 
	{
		return this.model;
	} //method getModel ends

	/**
	 * @return the year
	 */
	public String getYear() 
	{
		return year;
	} //method getYear ends
	
	/**
	 * @return the speed
	 */
	public float getSpeed()
	{
		return this.speed;
	} //method getSpeed ends

	public Vehicle()
	{
		
	} //constructor ends
	
	public void accelerate()
	{
		this.speed += 4;
		
		if(this.speed > this.MAX_SPEED)
		{
			this.speed = this.MAX_SPEED;
		} //if ends
	} //method accelerate ends
	
	public void decelerate()
	{
		this.speed -= 6;
		
		//if the speed goes lower than 0, set it to 0
		if(this.speed < 0)
		{
			this.speed = 0;
		} //if ends
	} //method decelerate ends
	
	public void turnLeft()
	{
		System.out.println("Good job. You turned left!");
	} //method turnLeft ends
	
	public void turnRight()
	{
		System.out.println("Good job. You turned right!");
	} //method turnRight ends
} //class Vehicle ends
