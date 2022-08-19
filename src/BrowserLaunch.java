import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//simple
		Alert pop = driver.switchTo().alert();

		String text = pop.getText();
		System.out.println(text);
		pop.accept();
		//confirm
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & ')]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		String text3 = pop.getText();
		System.out.println(text3);
		pop.dismiss();
		//prompt
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		String text2 = pop.getText();
		System.out.println(text2);
		pop.sendKeys("sakee");
		pop.accept();
		driver.close();
		
		
		
		
		
		
		
		
		
	
	}

	

}
