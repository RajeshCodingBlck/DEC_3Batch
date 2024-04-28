package OOP2;

public class Login_page {
     
	  
	  public String name;
	  
	  private String Password;
	  
	  Login_page(String name, String password){
		  this.name=name;
		  this.Password=password;
	  }
	  
	  public boolean Update_password(String new_password, String Old_password) {
		  
		  
		  if(Password.equals(Old_password)) {
			  
			  Password= new_password;
			  return true;  
		  }else {
			  
			  return false;
		  }
		    
	  }
	  
	  public String Get_password(String password) {
		  
		  if(this.Password.equals(password)) {
			  
			  String str= this.name+ " ,"+ this.Password;
			  
			  return str;
		  }else {
			  
			  return "Chal Nikal";
		  }
	  }
	  
	  
}
