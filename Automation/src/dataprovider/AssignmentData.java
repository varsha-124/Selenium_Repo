package dataprovider;

import org.testng.annotations.DataProvider;

public class AssignmentData {
@DataProvider
public String[][] login()
{
	String data[][]= {
			{"abhis1234@gmail.com","abhis@1234"},
			{"vast@gmail.com","abhis@1234"},
			{"abhis1234@gmail.com","var@123"},
			{"vast@gmail.com","var@123"}
			
	};
	return data;
}
}
