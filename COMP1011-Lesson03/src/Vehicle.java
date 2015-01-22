/**
 * @author Blaine Parr
 * Class Description: Creating a vehicle class used as a superclass for all other vehicles
 */
public abstract class Vehicle 
{
	protected int numWheels = 4;
	protected int numDoors = 2;
	protected String colour = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	protected final int MAX_SPEED = 40;
	
	//Constructors///////////////////////////////////////////////////////////////////////////////
	public Vehicle(int wheels, int doors, String colour, String make, String model, String year)
	{
		this.numWheels = wheels;
		this.numDoors = doors;
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
	} //constructor ends
	
	public Vehicle(String colour, String make, String model, String year)
	{
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
	} //constructor ends
	
	//Getters////////////////////////////////////////////////////////////////////////////////////
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

	//Public Abstract Methods////////////////////////////////////////////////////////////////////
	//Must be overridden
	public abstract void accelerate();
	
	public abstract void decelerate();
	
	public void turnLeft()
	{
		System.out.println("Good job. You turned left!");
	} //method turnLeft ends
	
	public void turnRight()
	{
		System.out.println("Good job. You turned right!");
	} //method turnRight ends
} //class Vehicle ends
