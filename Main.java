/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;
	private int mouthNumber;
	
	// add one instance variable HERE
	
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
		mouthNumber = 1;
    // initialize your instance variable HERE

	}
	
	
	
	
	/**
	int getNumOfMouths()
	accessor method for mouthNumber
	@return mouthNumber an int describing the number of mouths.
	*/
	
	
	
	public int getNumOfMouths(){
	   return mouthNumber;
	}
	
	
	/**
	void setNumOfMouths(int _mouthNumber)
	mutator method for mouthNumber
	@param _mouthNumber for the amount of mouths the user desires.  
	*/
	
	
	
	public void setNumberOfMouths(int _mouthNumber){
	   mouthNumber = _mouthNumber;
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
		String getNumOfEyes()
		accessor method for eyeNumber
		@return eyeNumber an int describing the number of eyes.
	*/
	public int getNumOfEyes()
  {
		return eyeNumber;
	}
	

	
	public String toString()
	{
		String output = "PotatoHead object. ";
		output += "Number Of Eyes: " + eyeNumber + ". ";
		
    // Add your instance variable to the toString() method using += HERE

		
		return output;
	}
}
