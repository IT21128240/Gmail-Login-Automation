package edureka;


import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		System.out.print(driver.getTitle());
		
		
		driver.findElement(By.id("identifierId")).sendKeys("info.aadhy@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("test");
		driver.findElement(By.className("VfPpkd-Jh9lGc")).click();
		
		
		driver.quit();
		
		
	
		
	}

}


