package Chat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatSession {
	
	public List<ChatMessage> recievedMessages ;
	public boolean parentalBlock ;
	ChatProviders p;
	String friendIDcon = "";
	String validFriend = "2";
	
	//created empty constructor to call from other class without parameters - manahsibx li qed jintuza
	public ChatSession()
	{
		
	}
	
	public ChatSession(ChatProviders provider)
	{
		recievedMessages = new ArrayList<ChatMessage>();
		parentalBlock = false;
	}
	
	public int initSession(String username , String password, String friendID)
	{
		//log in 
		Login l = new Login();
		int loginStatus = l.Login(username, password);
		
		//success
		if(loginStatus == 0)
		{
			p = new ChatProviders(username, password);		
		}
		
		else //invalid
		{
			return 1;
		}
		
		if(p.getName() == "") //empty?
		{
			return 2; 
		}
		
		else //anything else ?
		{
			friendIDcon = friendID;
			return 0;
		}
	}
	
	public int sendMessage(String text)
	{
		//Duncan:
		//invalid friend 5
		//fix this shit !
		
		//Jean:
		//heqelmedenne ok ux
		
		
		if((text.length()) >(p.getMaxMessageLength()))
			return 2;
		if(text.equals(""))
			return 3;
		if((text.equals("Fudge")|| text.equals("Yikes") || text.equals("Pudding"))&& parentalBlock ==true)
			return 4;
		if(p.checkFriend(friendIDcon) == false)
			return 5;	
		
		int status = p.sendMessageTo(friendIDcon, text);
		if(status ==1)
			return 1;
		if(status ==2)
			return 1;
		if(status ==3)
			return 1;
			
		if(p.CurrentProvider =="")
		{
			return 1;
		}
			
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
