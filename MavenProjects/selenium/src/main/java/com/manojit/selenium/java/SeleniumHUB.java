package com.manojit.selenium.java;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumHUB {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		ChromeOptions co=new ChromeOptions();
		 //InternetExplorerOptions ieo=new InternetExplorerOptions();
		co.merge(ds);
		String hubURl="http://192.168.0.8:4444/wd/hub";
		WebDriver driver= new RemoteWebDriver(new URL(hubURl), ds);
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		
	}

}
