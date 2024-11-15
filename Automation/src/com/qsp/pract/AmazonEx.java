package com.qsp.pract;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonEx {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp= ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/ele.png");
	FileHandler.copy(temp, dest);
}
}
