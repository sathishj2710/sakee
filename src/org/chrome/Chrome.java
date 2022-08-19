package org.chrome;

import java.time.chrono.ThaiBuddhistEra;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) throws InterruptedException {
		/*//QUESTION 9
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//QUESTION 8
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.instagram.com/accounts/login/?hl=en) login page");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement email = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone')]"));
		email.sendKeys("sakee@122.com");
		WebElement pass = driver.findElement(By.xpath("(//input[@aria-required='true'])[1]"));
		pass.sendKeys("4489sakee");
		*/
		
		
		
		
		
		
		
		
		/*//question7
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement phoneno = driver.findElement(By.xpath("//input[@class='col-xs-24']"));
		phoneno.sendKeys("9042664318");
		driver.close();
		*/
		
		
		
		
		
		
		
		
		
		/*//question6
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement location = driver.findElement(By.xpath("//input[@type='text']"));
		location.sendKeys("Perumbakkam");
		
		*/
		
		
		
		
		
		
		
		//question4
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement userId = driver.findElement(By.xpath("//input[@title='User Id']"));
		js.executeScript("arguments[0].setAttribute('value','sakee')", userId);
		WebElement click = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		js.executeScript("arguments[0].click()", click);
		Thread.sleep(10000);
		
		
		
		
		
		
		
		
		
		
		
		
		/*//QUESTION 3

		 * System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver chdriver = new ChromeDriver();
		chdriver.get("https://www.google.com/");
		chdriver.manage().window().maximize();
		String title = chdriver.getTitle();
		System.out.println(title);
		String currentUrl = chdriver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement txtuser = chdriver.findElement(By.xpath("//input[@title='Search']"));
		txtuser.sendKeys("GreensTechnology");
		WebElement txtgren = chdriver.findElement(By.xpath("//input[type='submit']"));
		txtgren.click();*/

		/*
		 * //question2 System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		 * WebDriver chdriver = new ChromeDriver();
		 * chdriver.get("https://www.redbus.in/");
		 * chdriver.manage().window().maximize(); String title = chdriver.getTitle();
		 * System.out.println(title); String currentUrl = chdriver.getCurrentUrl();
		 * System.out.println(currentUrl); WebElement txtUser =
		 * chdriver.findElement(By.id("src")); txtUser.sendKeys("chennai");
		 */

		/*
		 * //day2question 1 System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		 * WebDriver chdriver = new ChromeDriver();
		 * chdriver.get("https://www.facebook.com/");
		 * chdriver.manage().window().maximize(); String title = chdriver.getTitle();
		 * System.out.println(title); String currentUrl = chdriver.getCurrentUrl();
		 * System.out.println(currentUrl); WebElement txtname =
		 * chdriver.findElement(By.xpath("//input[@type='text']"));
		 * txtname.sendKeys("sakee@123"); WebElement txtpas =
		 * chdriver.findElement(By.xpath("//input[@type='password']"));
		 * txtpas.sendKeys("123456"); WebElement btlogin =
		 * chdriver.findElement(By.xpath("//button[@value='1']")); btlogin.click();
		 */

		/*
		 * WebElement txtu=chdriver.findElement(By.xpath(
		 * "//a[@href='https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU4NDIxNTgwLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login']"
		 * )); txtu.click(); WebElement txt =
		 * chdriver.findElement(By.xpath("(//a[@role='button'])[1]")); txt.click();
		 */

		/*
		 * WebElement txtuser =
		 * chdriver.findElement(By.xpath("//input[@name='firstname']"));
		 * txtuser.sendKeys("sathish"); WebElement txtUser =
		 * chdriver.findElement(By.xpath("//input[@name='lastname']"));
		 * txtUser.sendKeys("Jaishankar"); WebElement txtNo = chdriver.findElement(By.
		 * xpath("//input[@aria-label='Mobile number or email address']"));
		 * txtNo.sendKeys("9042664318"); WebElement txtpass =
		 * chdriver.findElement(By.xpath("//input[@type='password']"));
		 * txtpass.sendKeys("txtpass"); WebElement txtday =
		 * chdriver.findElement(By.xpath("//select[@aria-label='Day']"));
		 * txtday.sendKeys("22"); // WebElement txtmonth =
		 * chdriver.findElement(By.xpath("")); // txtmonth.sendKeys();
		 */
		/*
		 * WebElement txtuser = chdriver.findElement(By.id("email"));
		 * txtuser.sendKeys("sakee@123"); WebElement txtpass =
		 * chdriver.findElement(By.id("pass")); txtpass.sendKeys("1234"); WebElement
		 * btlogin = chdriver.findElement(By.name("login")); btlogin.click();
		 */

	}

}
