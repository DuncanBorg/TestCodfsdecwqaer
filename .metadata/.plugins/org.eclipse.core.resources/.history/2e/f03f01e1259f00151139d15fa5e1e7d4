import java.util.ArrayList;
import java.util.List;

public class Providers implements ChatProvider{

	List<Users> users = new ArrayList<Users>();

	
	@Override
	public void chatProvider(String username, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMaxMessageLength() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sendMessageTo(String friendID, String msg) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int onMessageRecived(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getUserData() {
		users.add(new Users("FbTest1","password",1,"Facebook"));
		users.add(new Users("FbTest2","password",2,"Facebook"));
		users.add(new Users("SkypeTest1","password",2,"Skype"));
		users.add(new Users("SkypeTest1","password",3,"Skype"));
		users.add(new Users("TwitterTest1","password",4,"Twitter"));
		
	}

}
