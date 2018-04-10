package webDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","F:\\selenium\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    //Launch website
		driver.navigate().to("http://www.calculator.net/");
		
		//Maximize the browser
		driver.manage().window().maximize();

	    // Click on Math Calculators
		driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
	  
	    // Click on Percent Calculators
		driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();

		// Enter value 10 in the first number of the percent Calculator
	    driver.findElement(By.id("cpar1")).sendKeys("10");

	    // Enter value 50 in the second number of the percent Calculator
	    driver.findElement(By.id("cpar2")).sendKeys("50");
	    
	    // Click Calculate Button
	    driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();

	    // Get the Result Text based on its xpath
	    String result = driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
	    
		//Print a Log In message to the screen
	    System.out.println(" The Result is " + result);
	    
		//Close the Browser.
	    driver.close();    

	}

}
