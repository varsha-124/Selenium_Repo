package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectMonth {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
	WebElement monthDropDown = driver.findElement(By.id("month"));
	Select month=new Select(monthDropDown);
	List<WebElement> totalMonth = month.getOptions();
	System.out.println(totalMonth.size());
	for(int i=0;i<=totalMonth.size()-1;i++)
	{
		month.selectByIndex(i);
		System.out.println(totalMonth.get(i).getText());//String text=
		//month.selectByVisibleText(text);
	}
	
	/*for(WebElement ele:totalMonth)
	{
		month.selectByVisibleText(ele.getText());
		if(ele.isSelected())
		{
			System.out.println(ele.getText()+"----->selected");
		}
		
	}*/
	
}
}
