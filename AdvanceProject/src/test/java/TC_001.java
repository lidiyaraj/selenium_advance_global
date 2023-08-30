import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ListenerImplementation;
@Listeners(ListenerImplementation.class)


public class TC_001 extends BaseClass {
	@Test
	
	public void demo()
	{
		System.out.println("main class");
		//int a=1/0;
		
		assertEquals(false, true);
	}
	

}
