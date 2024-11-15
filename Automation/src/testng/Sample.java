package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample { //TestNG class
@Test
public void demo() //test case
{
	//test steps
	Reporter.log("Welcome to Selenium",true);
}

@Test
public void sample()
{
	Reporter.log("Welcome to advanced selenium",true);
}
}
