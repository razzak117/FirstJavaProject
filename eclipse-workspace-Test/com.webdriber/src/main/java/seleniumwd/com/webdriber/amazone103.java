package seleniumwd.com.webdriber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazone103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\SeleniumWD\\chrome\\v108\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\SeleniumWD\\chrome\\v108\\chromedriver.exe");
		
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");

	}

}
