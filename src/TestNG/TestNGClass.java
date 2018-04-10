package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.System;

public class TestNGClass {

//	System.setProperty("webdriver.firefox.driver","F:\\selenium\\geckodriver-v0.9.0-win64\\geckodriver.exe");
//
//  WebDriver driver = new FirefoxDriver();
	
	WebDriver driver;
	
  @BeforeTest
  public void Beforett() {
	  
	 System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");

	 System.setProperty ( "webdriver.firefox.bin" , "C:/Program Files (x86)/Mozilla Firefox/firefox.exe" );
	 
	 driver = new FirefoxDriver();
	  
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 driver.navigate().to("https://www.leangoo.com/kanban/board/go/2351913");
	  
	 driver.manage().window().maximize();
	  
  }
  @Test
  public void testDemo01(){
	  //输入用户名
	  driver.findElement(By.xpath(".//*[@id='tabPaneEmail']/div[1]/input")).sendKeys("shiwei@eigpay.com.cn");
	  //输入密码
	  driver.findElement(By.xpath(".//*[@id='tabPaneEmail']/div[2]/input")).sendKeys("ww744934");
	  //点击登录按钮
	  driver.findElement(By.xpath(".//*[@id='tabPaneEmail']/div[4]/button")).click();
	  //等待时间
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  //点击列表右上角‘三’
	  driver.findElement(By.xpath(".//*[@id='list_6559802']/div/div[1]/a")).click();
	  //点击“添加卡片”
	  driver.findElement(By.xpath(".//*[@id='ulListMenu']/li[1]/a")).click();
	  //输入卡片内容
	  driver.findElement(By.xpath(".//*[@id='block_17d4d69c21ed4e0e']/div[1]/div[1]/div[1]/textarea")).sendKeys("测试新增卡片");
	  //输入卡片内容后，点击“添加”按钮
	  driver.findElement(By.xpath(".//*[@id='block_17d4d69c21ed4e0e']/div[1]/div[1]/div[3]/button[1]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //‘取消’按钮
	  driver.findElement(By.xpath(".//*[@id='block_17d4d69c21ed4e0e']/div[1]/div[2]/div[3]/button[2]")).click();
	  
	  
	   driver。get
	   
	   
	  //点击整个卡片进入
	  driver.findElement(By.xpath(".//*[@id='task_e2cb80b7a1483018']/span")).click();
	  //点击成员
	  driver.findElement(By.xpath(".//*[@id='divEditButtonGroup']/div[1]/button")).click();
	  //选择成员“石微”
	  driver.findElement(By.xpath(".//*[@id='divAddUser']/div[3]/ul/li[1]/div/span[2]")).click();
	  //选择标签
	  driver.findElement(By.xpath(".//*[@id='divEditButtonGroup']/div[2]/button")).click();
	  //选择普通标签
	  driver.findElement(By.xpath(".//*[@id='divColorList_tag']/div[1]/ul/li[3]/div")).click();
	  //关闭标签
	  driver.findElement(By.xpath(".//*[@id='divAddOrSetTag']/div[1]/button[2]")).click();
	  //关闭看板卡片
	  driver.findElement(By.xpath(".//*[@id='divTaskEdit']/button")).click();
	  
//	  driver.findElement(By.xpath(".//*[@id='tabPaneEmail']/div[4]/button")).click();
//	  
//	  driver.findElement(By.xpath(".//*[@id='list_6616306']/div/div[1]/a")).click();
//	  
//	  driver.findElement(By.xpath(".//*[@id='list_6559802']/div/div[1]/a/span")).click();
	  
  }
}
