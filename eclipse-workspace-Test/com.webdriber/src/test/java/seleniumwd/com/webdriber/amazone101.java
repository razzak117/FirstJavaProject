package seleniumwd.com.webdriber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazone101 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\SeleniumWD\\chrome\\v108.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();

		//input[@type='text']
		//input[@type='submit']
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("coffee macker");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
