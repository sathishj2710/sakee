import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample {
	public static  void main(String[] args)throws InterruptedException,Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.Zalando.de");
		driver.manage().window().maximize();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Chrome\\Screenshot\\login.jpg");
		FileUtils.copyFile(src, des);
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
