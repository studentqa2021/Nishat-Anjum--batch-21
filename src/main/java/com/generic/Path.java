package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path {
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");   //("Webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
		driver.quit();
		
		
	}
	}

	
