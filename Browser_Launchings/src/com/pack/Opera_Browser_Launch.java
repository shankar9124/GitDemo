package com.pack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera_Browser_Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.opera.driver","C:\\OperaDriver\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.quit();

	}

}
