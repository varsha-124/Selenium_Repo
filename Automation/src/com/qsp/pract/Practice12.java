package com.qsp.pract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice12 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in/");
	WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));
	Select item=new Select(allDropDown);
	item.selectByVisibleText("Beauty");
	System.out.println(item.isMultiple());
	WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
	System.out.println(searchBar.getAttribute("placeholder"));
	searchBar.sendKeys("Laptop");
	driver.findElement(By.id("nav-search-submit-button")).click();
}
}
