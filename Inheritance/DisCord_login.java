package Inheritance;

public class DisCord_login extends login {

	
	String userId;
	
	DisCord_login(String emailId, String password, String userId){
		super(emailId, password);
		
		this.userId=userId;
		
	}
	
	
	
}
