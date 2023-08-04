package newjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectors {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo R3\\eclipse-workspace new\\newjava\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("compendiumdev")).click();
		String ele = driver.findElement(By.cssSelector("html body [id='para1']")).getText();
		 System.out.println(ele);
		 System.out.println("again modified by me");

	}

}
