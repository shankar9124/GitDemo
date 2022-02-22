package com.pack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet_Explorer_Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\IEDriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.close();

	}

}
