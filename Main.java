/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;
	
	// STEP ONE: add one instance variable HERE
	
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
    		// STEP TWO: initialize your instance variable HERE

	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  	// STEP THREE: Add an accessor method for your instance variable with Javadoc comments
	// STEP FOUR: Add a mutator method for your instance variable with Javadoc comments
	
		
	/**
		void setEyeNumber(int _numOfEyes)
		mutator method for eyeNumber
		@param _numOfEyes how many eyes should this Potatohead have? 
	*/	
	
	public void setEyeNumber(int _numOfEyes)
  	{
		eyeNumber = _numOfEyes;
	}
		
	/**
		String getEyeNumber()
		accessor method for eyeNumber
		@return eyeNumber an int describing the number of eyes.
	*/
	public int getEyeNumber()
 	 {
		return eyeNumber;
	}
	

	
	public String toString()
	{
		String output = "PotatoHead object. ";
		output += "Number Of Eyes: " + eyeNumber + ". ";
    		// STEP FIVE: Add your instance variable to the toString() method using += HERE

		
		return output;
	}
}
