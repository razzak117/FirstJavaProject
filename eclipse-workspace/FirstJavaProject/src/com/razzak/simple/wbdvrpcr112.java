package com.razzak.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wbdvrpcr112 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\SeleniumWD\\chrome\\v108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.pcrichard.com/");
		//driver.findElement(By.name("q")).sendKeys("tv");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();


	}

}
