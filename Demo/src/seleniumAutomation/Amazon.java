package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Bux\\eclipse-workspace\\Demo\\Driver\\chromedriver.exe");
   ChromeDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/");
   
   WebElement name = driver.findElement(By.id("email"));
   name.sendKeys("tms.manimaran@gmail.com");
   WebElement pass = driver.findElement(By.id("pass"));	
   pass.sendKeys("manokaran");
   WebElement button = driver.findElement(By.name("login"));
   button.click();
   
   
	}

}
