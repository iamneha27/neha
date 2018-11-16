package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionFirstTest {
	
	WebDriver driver;
  @Test(enabled=false)
  public void login() {
	  
	  driver.get("https://www.homeshop18.com/");
	  Actions act = new Actions(driver);
	  WebElement digital1 = driver.findElement(By.xpath("//a[@title='Close']"));
	  act.click(digital1).perform();
	  WebElement digital2= driver.findElement(By.xpath("//a[text()='Later']"));
	  act.click(digital2).perform();
	  WebElement digital= driver.findElement(By.xpath("//a[text()='Digital']"));
	  act.moveToElement(digital).perform();
	 
  }
  @Test(enabled=false)
  public void rightClick()
  {
	  driver.get("https://www.google.com/");
	  Actions act = new Actions(driver);
	  WebElement digital1 = driver.findElement(By.xpath("//div[@id='SIvCob']/a[1]")); 
	  act.keyDown(Keys.CONTROL).click(digital1).build().perform();
  }
  @Test(enabled=false)
  public void rtClick()
  {
	  driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
	  Actions act = new Actions(driver);
	  WebElement digital1 = driver.findElement(By.xpath("//span[text()='right click me']")); 
	act.contextClick(digital1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
  }
  @Test(enabled=true)
  public void rt1Click()
  {
	  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	  Actions act = new Actions(driver);
	  WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']")); 
	  WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']")); 
	act.dragAndDrop(draggable,droppable).perform();
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
