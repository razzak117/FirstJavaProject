package com.razzak.webdrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wbdrv24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\SeleniumWD\\chromedriver.exe");
		driver.get("https://www.amazon.com/");
		driver.close();


	}

}
