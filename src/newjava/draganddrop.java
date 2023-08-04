package newjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo R3\\eclipse-workspace new\\newjava\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		WebElement minmax = driver.findElement(By.xpath("//*[@aria-labelledby=\"price-min-label\"]"));
		 Actions a=new Actions(driver);
		 Thread.sleep(3000);
		    a.dragAndDropBy(minmax, 200, 0).perform();
		    Thread.sleep(3000);
		    a.dragAndDropBy(minmax, -200, 0).perform();
		  // WebElement element = driver.findElement(By.xpath("//*[@title=\"search\"][@type=\"submit\"]"));
		       // a.contextClick(element).perform();
		        
		        WebElement element2= driver.findElement(By.name("q"));
		        element2.sendKeys("vighnesh");
		        Thread.sleep(3000);
		        a.doubleClick(element2).perform();
		        driver.close();
	}

}
