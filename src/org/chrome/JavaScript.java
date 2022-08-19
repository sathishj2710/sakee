package org.chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\\\www.zalando.de");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// click the button
		WebElement btnok = driver.findElement(By.xpath("//button[@class='uc-btn uc-btn-primary']"));
		js.executeScript("arguments[0].click()", btnok);
		Thread.sleep(3000);
		// click login button
		WebElement Login = driver.findElement(By.xpath("//a[@title='Login']"));
		js.executeScript("arguments[0].click()", Login);
		Thread.sleep(10000);
		// pass the Uername
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		js.executeScript("arguments[0].setAttribute('value','sakee')", username);
		Thread.sleep(3000);
		// pass the password
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','1234')", pass);
		Thread.sleep(3000);
		// getAttribute
		Object o = js.executeScript("return arguments[0].getAttribute('value')", pass);
		String s = String.valueOf(o);
		System.out.println(s);
		WebElement button = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		js.executeScript("arguments[0].click()", button);
		Thread.sleep(3000);
		driver.close();
				
			}
			
		
		
		
	
		
		
		



	}


