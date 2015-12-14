package JUnitTests;

import Chat.*;
//import org.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class LoginTest {
	
	LoginTest logintest;
	@Before
	public void setup()
	{
		logintest = new LoginTest();
	}
	
	@Test
	public void testValid()
	{
		Login login = new Login();
		System.out.println(login.Login("FbTest1", "password"));
		assertEquals("0", ""+login.Login("FbTest1", "password"));
	}
	
	@Test
	public void testInvalid()
	{
		Login login = new Login();
		assertEquals("1", ""+login.Login("bad", "bad"));
	}
	
	public void testTimeout()
	{
		//needs to be done later
	}
	
	

}
