package Chat;
import java.util.ArrayList;
import java.util.List;

public class Login {
	List<Users> users = new  ArrayList<Users>();
	
	public int Login(String username, String password)
	{
		getUserData();
		try {
	        for(Users user : users)
	        {
				if(user.username.equals(username))
				{
					if(user.password.equals(password))
					{
						return 0;
					}
				}
			}
		} catch (Exception e) {
	        return 2;
	    }
		return 1;
	}
	public void getUserData() {
		users = new  ArrayList<Users>();
		users.add(new Users("FbTest1","password",1,"Facebook","out"));
		users.add(new Users("FbTest2","password",2,"Facebook","in"));
		users.add(new Users("FbTest3","password",3,"Facebook","out"));
		users.add(new Users("SkypeTest1","password",4,"Skype","in"));
		users.add(new Users("SkypeTest1","password",5,"Skype","out"));
		users.add(new Users("TwitterTest1","password",6,"Twitter","out"));
		
	}
}
