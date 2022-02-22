package com.pack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Edge_Browser_Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\EdgeDriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.cricbuzz.com/");
		//driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		driver.close();
		
	}

}
