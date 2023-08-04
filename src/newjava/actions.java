package newjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo R3\\eclipse-workspace new\\newjava\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		 WebElement blog = driver.findElement(By.id("blogsmenu"));
		     WebElement selenium143 = driver.findElement(By.xpath("//a//span[text()=\"Selenium143\"]"));
		  Actions a=new Actions(driver);
		   a.moveToElement(blog).perform();
		   //a.click(selenium143).perform();
		 
	}

}
