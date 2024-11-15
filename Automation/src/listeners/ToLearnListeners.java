package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class ToLearnListeners {
@Test
public void login()
{
	Reporter.log("Launch the browser",true);
	Reporter.log("Navigate to URL",true);
	Reporter.log("Click on login link",true);
	Reporter.log("Enter valid credentials",true);
	Reporter.log("Click on login",true);
	Assert.assertEquals(true, false);
}
}
