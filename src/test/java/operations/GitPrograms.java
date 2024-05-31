package operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GitPrograms {
	public static WebDriver driver;
	@Test
	public void setup() throws Throwable {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.close();

	}
		
	
	}
	
	