
public interface ChatProvider {
	
	void chatProvider(String username,String password);

	int getMaxMessageLength();
	
	String getName();
	
	int sendMessageTo(String friendID,String  msg);
	
	int onMessageRecived(String text);
	
	void getUserData();
}
