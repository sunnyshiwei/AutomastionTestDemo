package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.System;

public class TestNGClass {

//	System.setProperty("webdriver.firefox.driver","F:\\selenium\\geckodriver-v0.9.0-win64\\geckodriver.exe");
//
//  WebDriver driver = new FirefoxDriver();
//	
//	WebDriver chromn = new ChromeDriver();
	WebDriver driver;
	
  @BeforeTest
  public void Beforett() {
	  
	 System.setProperty("webdriver.firefox.driver","F:\\selenium\\geckodriver-v0.9.0-win64\\geckodriver.exe");

	 WebDriver driver = new FirefoxDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.navigate().to("https://www.leangoo.com/kanban/board/go/2362988");
	  
	  driver.manage().window().maximize();
	  
  }
  @Test
  public void testDemo01(){
	  
	  driver.findElement(By.xpath(".//*[@id='list_6616306']/div/div[1]/a")).click();
	  
	  driver.findElement(By.xpath(".//*[@id='task_6b2e711703a03a0b']/div[3]/div[2]/span")).click();
	  
  }
}
