package org.chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	private Object OutputType;

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.zalando.de");
		driver.manage().window().maximize();
		//move to element and right click
		WebElement doublee = driver.findElement(By.xpath("//span[text()='Brands']"));
		Actions a = new Actions(driver);
		a.moveToElement(doublee).contextClick().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//window handling
		Set<String> allwin = driver.getWindowHandles();
		List<String> child = new ArrayList<>();
		child.addAll(allwin);
		String text = child.get(1);
		driver.switchTo().window(text);
		WebElement scroll = driver.findElement(By.xpath("//span[text()='And Shine']"));
		//scroll and heilight
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		js.executeScript("arguments[0].setAttribute('style','background:blue')", scroll);
		Thread.sleep(3000);
		// Screenshot
		TakesScreenshot tk = (TakesScreenshot) driver;
		// get the screenshot
		File src = tk.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		// mentin the desired location
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Screenshot\\project.jpg");
		FileUtils.copyFile(src, des);
		Thread.sleep(3000);
		driver.close();

	}
}
