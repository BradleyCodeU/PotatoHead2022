/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;
  private String headColor;
	private int mouthNumber;
	ptivate String shoeColor;
	
	// STEP ONE: add one instance variable HERE
	
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
    // initialize your instance variable HERE
		headColor = "brown";
    mouthNumber = 1;
		shoeColor = "blue";


	}
	
	
	
	

	   
		
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  	// STEP THREE: Add an accessor method for your instance variable with Javadoc comments
	// STEP FOUR: Add a mutator method for your instance variable with Javadoc comments
	
		
	
		
	/**
		String getEyeNumber()
		accessor method for eyeNumber
		@return eyeNumber an int describing the number of eyes.
	*/
	public int getEyeNumber()
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
  
  
  /**
    int getNumOfMouths()
    accessor method for mouthNumber
    @return mouthNumber an int describing the number of mouths.
	*/
	public int getNumOfMouths(){
	   return mouthNumber;
	}
	
	/**
    String getShoeColor()
    accessor method for shoeColor
    @return shoeColor a String describing the color of shoe.
	*/
	public String getShoeColor(){
	   return shoeColor;
	}
	
	
	/**
    void setNumOfMouths(int _mouthNumber)
    mutator method for mouthNumber
    @param _mouthNumber for the amount of mouths the user desires.  
	*/
	public void setNumberOfMouths(int _mouthNumber){
	   mouthNumber = _mouthNumber;
	}
  
  
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
		void setHeadColor(String _headColor)
		mutator method for headColor
		@param _headColor sets the head color of this potato head
	*/
	public void setHeadColor(String _headColor){
		headColor = _headColor;		
	}
	
        /**
		void setHeadColor(String _headColor)
		mutator method for shoeColor
		@param _shoeColor sets the shoe color of this potato head
	*/
	
	public void setShoeColor(String _shoeColor){
		shoeColor = _shoeColor;		
	}
	

	/**
		String toString()
		@return Returns a String description of this Potatohead object.
	 */
	public String toString()
	{
		String output = "PotatoHead object. ";
		output += "Number Of Eyes: " + eyeNumber + ". ";
    // STEP FIVE: Add your instance variable to the toString() method using += HERE
		output += "Color Of Head: " + headColor + ". ";
    output += "Number Of Mouths: " + mouthNumber + ". ";
                output += "Shoe Color: " + shoeColor + ". ";
		
		return output;
	}
}
