package com.sujeet.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


	public class HandlingScreenShot {

		public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		TakesScreenshot screen=(TakesScreenshot) driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Sujeet Yadav\\ScreenShot\\TestAuto2.jpeg");
		FileHandler.copy(src, dest);
        driver.close();
        driver.quit();
        System.out.println("new code added");
        
		}


}
