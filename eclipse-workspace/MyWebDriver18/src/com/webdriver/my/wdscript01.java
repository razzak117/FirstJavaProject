package com.webdriver.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wdscript01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\SeleniumWD\\chrome\\v108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.wikipedia.org/");
		String baseUrl="https://www.wikipedia.org/";
		driver.get(baseUrl);
		
		System.out.println("Page opened successfully");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		String pageTitle=driver.getTitle();
		System.out.println("Title of the page: "+pageTitle);
		
		driver.findElement(By.id("js-link-box-en")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Page closed successfully");
		
		//https://www.wikipedia.org/

	}

}
