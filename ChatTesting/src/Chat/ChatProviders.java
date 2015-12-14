package Chat;
import java.util.ArrayList;
import java.util.List;

public class ChatProviders{

	List<Users> users = new ArrayList<Users>();
	String CurrentProvider =  "";
	
	public ChatProviders(String username, String password) {
		// TODO Auto-generated method stub
		for(Users user : users)
        {
			if(user.username.equals(username))
			{
				if(user.password.equals(password))
				{
					CurrentProvider = user.Provider;
				}
			}
		}
		
	}
	
	public int getMaxMessageLength() {
		if(CurrentProvider == "Facebook")
		{
			return 15;
		}
		if(CurrentProvider == "Skype")
		{
			return 10;
		}if(CurrentProvider == "Twitter")
		{
			return 5;
		}
		else{
			return 10000;
		}
		
	}


	public String getName() {
		return CurrentProvider;
	}


	public int sendMessageTo(String friendID, String msg) {
		for(Users user : users)
		{
			if(friendID.equals(user.id + ""))
			{
				if(user.Status == "out")
					return 2;
			}
		}
		if(checkFriend(friendID)==false)
			return 1;
		
		
		return 0;
	}


	public void onMessageRecived(String text) {
		ChatSession ses = new ChatSession(this);
		ses.onMessageRecieved(text);
		
	}
	public boolean checkFriend(String friend)
	{
		for(Users user : users)
		{
			if(user.Provider.equals(CurrentProvider))
			{
				String tempid = user.id +"" ;
				if(tempid.equals(friend))
				{
				
					return true;
					
				}
			}
		}
		
		return false;
	}

	public void getUserData() {
		users.add(new Users("FbTest1","password",1,"Facebook","out"));
		users.add(new Users("FbTest2","password",2,"Facebook","in"));
		users.add(new Users("FbTest3","password",3,"Facebook","out"));
		users.add(new Users("SkypeTest1","password",2,"Skype","in"));
		users.add(new Users("SkypeTest1","password",3,"Skype","out"));
		users.add(new Users("TwitterTest1","password",4,"Twitter","out"));
		
	}

}
