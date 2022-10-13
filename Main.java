/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;
  private String headColor;
	private int mouthNumber;
	private String shoeType;
	private String eyeColor;
	// STEP ONE: add one instance variable HERE
	
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
		eyeColor = "Black";
    // initialize your instance variable HERE
		headColor = "brown";
    mouthNumber = 1;
		shoeType = "Yeezy's";


	}
	
	
	
	

	   
		
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  	// STEP THREE: Add an accessor method for your instance variable with Javadoc comments
	// STEP FOUR: Add a mutator method for your instance variable with Javadoc comments
	
	/**
		String getEyeColor()
		accessor method for eyeColor
		@return eyeColor an String describing the color of the eye(s).
	*/
	
	public String getEyeColor()
  	{
		return eyeColor;
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
    void setNumOfMouths(int _mouthNumber)
    mutator method for mouthNumber
    @param _mouthNumber for the amount of mouths the user desires.  
	*/
  public void setNumberOfMouths(int _mouthNumber){
	   mouthNumber = _mouthNumber;
	}

  /**
		String getShoeType()
		accessor method for getShoeType
		@return shoeType a string describing the type of shoe's.
	*/
	public String getShoeType() {
		return shoeType;
	}
  
	
	/**
		void setShoeType(String _shoeType)
		mutator method for shoeType
		@param _shoeType what type of shoe should this Potatohead have? 
	*/	
	public String setShoeType(String _shoeType) {
		shoetype = _shoeType;
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
		String setEyeColor()
		mutator method for eyeColor
		@param _eyeColor what color should the eye(s) be?
	*/
	
	public void setEyeColor(_eyeColor)
  {
		eyeColor = _eyeColor;
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
	  output += "Type of shoe: " + shoeType + ". "; 
		output += "Color Of Eye(s): " + eyeColor + ". ";


		
		return output;
	}
}
