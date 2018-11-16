package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test(enabled=false)
  public void f() {
	  
	  driver.get("http://jqueryui.com/dialog/");
	//  Actions act = new Actions(driver);
	 WebElement digital1 = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	 // act.click(digital1).perform();
	 driver.switchTo().frame(digital1);
	 //driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//button[@title='Close']"));
	  driver.switchTo().defaultContent();
  }
  @Test(enabled=true)
  public void f2() {
	  
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
	 WebElement digital1 = driver.findElement(By.xpath("//*[@id='iframeResult']"));
	 
	 driver.switchTo().frame(digital1);
	 WebElement digital2 = driver.findElement(By.xpath("//*[@src='demo iframe.htm']"));
	 driver.switchTo().frame(digital2);
System.out.println(driver.findElement(By.xpath("html/body/h1")).getText());
	 		  driver.switchTo().defaultContent();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
