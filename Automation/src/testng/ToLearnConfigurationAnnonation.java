package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToLearnConfigurationAnnonation {
	
@BeforeSuite
public void beforeSuite()
{
	Reporter.log("Before Suite",true);
}

@BeforeTest
public void beforeTest()
{
	Reporter.log("Before Test",true);
}

@BeforeClass
public void beforeClass()
{
	Reporter.log("Before Class",true);
}

@BeforeMethod
public void beforeMethod()
{
	Reporter.log("Before Method",true);
}

@Test
public void demo()
{
	Reporter.log("Testscript executed",true);
}

@AfterMethod
public void afterMethod()
{
	Reporter.log("After Method",true);
}
@AfterClass
public void afterClass()
{
	Reporter.log("After class",true);
}

@AfterTest
public void afterTest()
{
	Reporter.log("After test",true);
}


@AfterSuite
public void afterSuite()
{
	Reporter.log("After suite",true);
}

@Test
public void demo1()
{
	Reporter.log("Test Script1 executed",true);
}
}
