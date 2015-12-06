import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatSession {
	public List<ChatMessage> recievedMessages ;
	public boolean parentalBlock ;
	
	public ChatSession(ChatProvider provider)
	{
		recievedMessages = new ArrayList<ChatMessage>();
		parentalBlock = false;
		
	}
	public int initSession(String username , String password, String friendID)
	{
		//log in 
		Login l = new Login();
		int loginStatus = l.Login(username, password);
		
		if(loginStatus == 0)
		{
			
		}
		return 0;
	}
	
	public int sendMessage(String text)
	{
		//provider timeout 1
		//invalid friend 5
		Providers p = new Providers();
		if((text.length()) >(p.getMaxMessageLength()))
			return 2;
		if(text.equals(""))
			return 3;
		if((text.equals("Fudge")|| text.equals("Yikes") || text.equals("Pudding"))&& parentalBlock ==true)
			return 4;
		
			
		return 0;
	}
	
	public void onMessageRecieved(String text)
	{
//		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		   //get current date time with Date()
		   Date date = new Date();

		ChatMessage newMSG = new ChatMessage(date,text);
		recievedMessages.add(newMSG);
		
	}

}
