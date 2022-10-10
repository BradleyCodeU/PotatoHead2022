/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;
	
	// add one instance variable HERE
	private String headColor;
	
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
    // initialize your instance variable HERE
		headColor = "brown";

	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  // Add an accessor method AND a mutator method for your instance variable HERE
	
		
	/**
		void setNumOfEyes(int _numOfEyes)
		mutator method for eyeNumber
		@param _numOfEyes for what the user desires.  
	*/	
	}
	public void setNumOfEyes(int _numOfEyes)
  {
		eyeNumber = _numOfEyes;
	}
	/**
		void setHeadColor(String _headColor)
		mutator method for headColor
		@param _headColor sets the head color of this potato head
	*/
	public void setHeadColor(String _headColor){
		headColor = _headColor		
	}
		
	/**
		String getNumOfEyes()
		accessor method for eyeNumber
		@return eyeNumber an int describing the number of eyes.
	*/
	public int getNumOfEyes()
  {
		return eyeNumber;
	}
	/**
		String getHeadColor()
		accessor method for headColor
		@return headColor get the head color of this potato head
	*/
	public String getHeadColor(){
		return headColor;
	}
	

	
	public String toString()
	{
		String output = "PotatoHead object. ";
		output += "Number Of Eyes: " + eyeNumber + ". ";
    // Add your instance variable to the toString() method using += HERE
		output += "Color Of Head: " + headColor + ". ";
		
		return output;
	}
}
