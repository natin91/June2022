package com.testing.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG_Annotations {

	public static WebDriver driver;
	
	
	
	@BeforeTest
	public void launchBrowser() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test
	public void loginCredentials() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	}
		
		@AfterTest
		public void logout() {
			driver.findElement(By.className("rd_logout")).click();
			driver.quit();
		}
		
	}
	
	
	
	

