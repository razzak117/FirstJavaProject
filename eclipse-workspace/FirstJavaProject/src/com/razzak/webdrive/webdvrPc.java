package com.razzak.webdrive;

public class webdvrPc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\SeleniumWD\\chrome\\v108\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.pcrichard.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	

	}

}
