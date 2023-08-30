import org.testng.annotations.Test;

public class demo {
	@Test(dataProvider = "testdata",dataProviderClass = generic.class)
	
		public void s(String d,String e,String k)
		{
		System.out.println(d+" "+e+" "+k);
		}
			
		}
	

