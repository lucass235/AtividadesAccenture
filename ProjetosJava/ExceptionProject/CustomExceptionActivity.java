//Needs to be completed
//1 - extend this class from Exception class
public class CustomExceptionActivity extends Exception{
	
	@Override
	public String getMessage () {
	
		return "Voce nao tem permisao pra usar esse programa!";
		
	}
	//2 - Override getMessage() and provide the following message 
	// "You are not allowed to use this program"
	
	
}
