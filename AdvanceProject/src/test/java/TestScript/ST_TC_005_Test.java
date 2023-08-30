package TestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ListenerImplementation;
@Listeners(ListenerImplementation.class)
public class ST_TC_005_Test  extends BaseClass{
	@Test
	public void vERIFY_THAT_USER_ABLE_TO_SEE_REQUIRED_MODULE_IN_THE_HOME_PAGE()
	{
		search.getSearchdownwardkey().click();
		for (int i = 0; i < 2; i++) {
			if ((search.getSelectedCheckboxname().getText().equals("Organizations"))||(search.getSelectedCheckboxname().getText().equals("Campaigns")))
			{
				search.getCheckbox().click();
				
			}
			
		}
		
	}
}
