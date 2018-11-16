package com.ActionDemo;


import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	WebDriver driver;
  @Test(enabled=false)
  public void fun() throws IOException {
	  
	  driver.get("http://jqueryui.com/dialog/");
	  File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcfile, new File("C:\\temp\\sceenshot.png"));
  }
  @Test(enabled=true)
  public void f() {
	  
	  driver.get("http://www.googlw.com");
	//  Actions act = new Actions(driver);s
	 
	/*
	  driver.findElement(By.name("q").sendKeys("selenium hq"));
	  WebElement digital1 = driver.findElement(By.name("btnk"));
	  JavascriptExecutor executor =(JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();",digital1);
	  executor.executeScript("window.scrollBy(0,400)");*/
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
  }

}
