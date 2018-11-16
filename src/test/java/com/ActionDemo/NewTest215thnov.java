package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;

public class NewTest215thnov {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	//  FirefoxProfile profile = new FirefoxProfile();
	// profile.addExtension(new File("C:\\Selenium Advance\\ExtensionsFile\\ExtensionsFile\\adblock.xpi"));
	  ProfilesIni profile = new ProfilesIni();
		 FirefoxProfile newfp=profile.getProfile("Selenium3prof");
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium Advance\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  driver= new FirefoxDriver(newfp);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
