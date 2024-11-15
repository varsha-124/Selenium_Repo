package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment1 {
@Test(invocationCount = 2)
public void createAccount()
{
	Reporter.log("Account created",true);
}
@Test (priority = 2)
public void deleteAccount()
{
	Reporter.log("Account deleted",true);
}
@Test(priority = 1,invocationCount = 3,threadPoolSize = 6)
public void editAccount()
{
	Reporter.log("Accounted edited",true);
}

}
