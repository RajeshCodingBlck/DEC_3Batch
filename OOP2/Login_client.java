package OOP2;

public class Login_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Login_page amazon= new Login_page("Rajesh", "12345");
      
     // amazon.Password="1121212";
      
      //System.out.println(amazon.Update_password( "1121212", "12345"));
      
      
      System.out.println(amazon.Get_password("12345"));
      
      
      
	}

}
