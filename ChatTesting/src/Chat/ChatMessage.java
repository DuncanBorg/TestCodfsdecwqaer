package Chat;
import java.util.Date;

public class ChatMessage {
	public String timestamp;
	public String content;
	
	
	@SuppressWarnings("deprecation")
	public ChatMessage(Date date , String con)
	{
		timestamp = date.toGMTString();
		content = con;
	}
}
