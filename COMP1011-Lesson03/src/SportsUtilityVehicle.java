/**
 * @author Blaine Parr
 * Class Desctription:
 */
public class SportsUtilityVehicle extends Vehicle 
{
	//Constructor/////////////////////////////////////////////////////////////////////////////////s
	/**
	 * @param colour
	 * @param make
	 * @param model
	 * @param year
	 */
	public SportsUtilityVehicle(String colour, String make, String model,
			String year) 
	{
		super(colour, make, model, year);
		this.numWheels = 4;
		this.numDoors = 5;
	}

	//Overridden Public Methods///////////////////////////////////////////////////////////////////
	@Override
	public void accelerate()
	{
		this.speed += 4;
		
		if(this.speed > this.MAX_SPEED)
		{
			this.speed = this.MAX_SPEED;
		} //if ends
	} //method accelerate ends
		
	@Override
	public void decelerate()
	{
		this.speed -= 6;
		
		if(this.speed < 0)
		{
			this.speed = 0;
		} //if ends
	} //method decelerate ends

}
