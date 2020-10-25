package finalActivity;

@SuppressWarnings("serial") //We currently don't need to use serialization.
public class CustomException extends Exception{

	//2 - Override getMessage() and provide the following message 
	// "You are not allowed to use this program"
	public String getMessage() {
		return "You are not allowed to enter digits into name field!";
	}	
}