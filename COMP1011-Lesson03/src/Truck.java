/**
 * 
 * @author Blaine Parr
 * Class Description:
 */
public class Truck extends Vehicle 
{
	//Constructor/////////////////////////////////////////////////////////////////////////////////
	public Truck(int wheels, int doors, String colour, String make, String model, String year) 
	{
		super(wheels, doors, colour, make, model, year);
		
		checkNumDoors();
	} //constructor ends
	
	//Private Methods/////////////////////////////////////////////////////////////////////////////
	private void checkNumDoors()
	{
		//if the truck has less than 3 doors set the doors to 3
		if(this.numDoors < 3)
		{
			this.numDoors = 3;
		} //if ends
	} //method checkNumDoors ends
	
	//Overridden Public Methods///////////////////////////////////////////////////////////////////
	@Override
	public void accelerate()
	{
		this.speed += 2;
		
		if(this.speed > this.MAX_SPEED)
		{
			this.speed = this.MAX_SPEED;
		} //if ends
	} //method accelerate ends
	
	@Override
	public void decelerate()
	{
		this.speed -= 3;
		
		if(this.speed < 0)
		{
			this.speed = 0;
		} //if ends
	} //method decelerate ends
} //class Truck ends
