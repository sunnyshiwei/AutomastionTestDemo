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
	  //�����û���
	  driver.findElement(By.xpath(".//*[@id='tabPaneEmail']/div[1]/input")).sendKeys("shiwei@eigpay.com.cn");
	  //��������
	  driver.findElement(By.xpath(".//*[@id='tabPaneEmail']/div[2]/input")).sendKeys("ww744934");
	  //�����¼��ť
	  driver.findElement(By.xpath(".//*[@id='tabPaneEmail']/div[4]/button")).click();
	  //�ȴ�ʱ��
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  //����б����Ͻǡ�����
	  driver.findElement(By.xpath(".//*[@id='list_6559802']/div/div[1]/a")).click();
	  //�������ӿ�Ƭ��
	  driver.findElement(By.xpath(".//*[@id='ulListMenu']/li[1]/a")).click();
	  //���뿨Ƭ����
	  driver.findElement(By.xpath(".//*[@id='block_17d4d69c21ed4e0e']/div[1]/div[1]/div[1]/textarea")).sendKeys("����������Ƭ");
	  //���뿨Ƭ���ݺ󣬵������ӡ���ť
	  driver.findElement(By.xpath(".//*[@id='block_17d4d69c21ed4e0e']/div[1]/div[1]/div[3]/button[1]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //��ȡ������ť
	  driver.findElement(By.xpath(".//*[@id='block_17d4d69c21ed4e0e']/div[1]/div[2]/div[3]/button[2]")).click();
	  
	  
	   driver��get
	   
	   
	  //���������Ƭ����
	  driver.findElement(By.xpath(".//*[@id='task_e2cb80b7a1483018']/span")).click();
	  //�����Ա
	  driver.findElement(By.xpath(".//*[@id='divEditButtonGroup']/div[1]/button")).click();
	  //ѡ���Ա��ʯ΢��
	  driver.findElement(By.xpath(".//*[@id='divAddUser']/div[3]/ul/li[1]/div/span[2]")).click();
	  //ѡ���ǩ
	  driver.findElement(By.xpath(".//*[@id='divEditButtonGroup']/div[2]/button")).click();
	  //ѡ����ͨ��ǩ
	  driver.findElement(By.xpath(".//*[@id='divColorList_tag']/div[1]/ul/li[3]/div")).click();
	  //�رձ�ǩ
	  driver.findElement(By.xpath(".//*[@id='divAddOrSetTag']/div[1]/button[2]")).click();
	  //�رտ��忨Ƭ
	  driver.findElement(By.xpath(".//*[@id='divTaskEdit']/button")).click();
	  
//	  driver.findElement(By.xpath(".//*[@id='tabPaneEmail']/div[4]/button")).click();
//	  
//	  driver.findElement(By.xpath(".//*[@id='list_6616306']/div/div[1]/a")).click();
//	  
//	  driver.findElement(By.xpath(".//*[@id='list_6559802']/div/div[1]/a/span")).click();
	  
  }
}
