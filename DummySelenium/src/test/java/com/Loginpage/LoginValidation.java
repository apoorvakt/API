package com.Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginValidation {

	
	static
	{
		//System.setProperty("webdriver.chrome.driver","./Software/chromedriver");
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	@Test
	public static void main() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(200);
		driver.get("http://cafetownsend-angular-rails.herokuapp.com/login");
		Thread.sleep(200);
		driver.findElement(By.xpath(".//input[@ng-model=\"user.name\"]")).sendKeys("Luke");
		driver.findElement(By.xpath(".//input[@ng-model=\"user.password\"]")).sendKeys("Skywalker");
		driver.findElement(By.xpath("//button[@class='main-button']")).click();
		
		
		//driver.get("www.google.com");
		}
	}


