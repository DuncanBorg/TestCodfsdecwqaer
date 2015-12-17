package JUnitTests;

import Chat.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mo //want to import mockito

import java.awt.List;


public class ChatSessionTest {
	
	ChatSessionTest chatsessiontest;
	List mockedList = mock(List.class);
	
	@Before
	public void setup()
	{
		chatsessiontest = new ChatSessionTest();
	}
	
	@Test
	public void testInitSession()
	{
		ChatSession chatsession = new ChatSession();
		
		
		
		System.out.println(chatsession.initSession("username" , "password" , "friendID"));
		assertEquals("0", ""+chatsession.initSession("username" , "password" , "friendID"));
	}

}
