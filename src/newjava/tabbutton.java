package newjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tabbutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo R3\\eclipse-workspace new\\newjava\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		Actions a =new Actions(driver);
		  driver.findElement(By.name("userid")).sendKeys("vighnesh");
		  Thread.sleep(3000);
		    a.sendKeys(Keys.TAB).perform();
		    Thread.sleep(3000);
		 driver.findElement(By.name("pswrd")).sendKeys("vighnesh1234");
		 a.sendKeys(Keys.TAB).perform();
		// driver.findElement(By.xpath("//*[@value=\"Login\"]")).click();
		 a.sendKeys(Keys.ENTER).perform();

	}

}
