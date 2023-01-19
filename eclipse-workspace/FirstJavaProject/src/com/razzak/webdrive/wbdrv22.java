package com.razzak.webdrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wbdrv22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\SeleniumWD\\chrome\\v108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.close();
	

	}

}
