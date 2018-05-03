package TestNG;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.System;

public class TestKanban {

//	System.setProperty("webdriver.firefox.driver","F:\\selenium\\geckodriver-v0.9.0-win64\\geckodriver.exe");
//
//  WebDriver driver = new FirefoxDriver();
	
	WebDriver driver;
	
  @BeforeTest
  public void Beforett() {
	  
	 System.setProperty("webdriver.gecko.driver","F:\\selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");

	 System.setProperty ( "webdriver.firefox.bin" , "C:/Program Files (x86)/Mozilla Firefox/firefox.exe" );
	 
	 driver = new FirefoxDriver();
	  
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	 driver.navigate().to("https://www.leangoo.com/kanban/board/go/2351913");
	  
	 driver.manage().window().maximize();
	  
  }
  @Test
  public void testKanban01(){
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
	  driver.findElement(By.xpath(".//*[@id='block_17d4d69c21ed4e0e']/div[1]/div[1]/div[1]/textarea")).sendKeys("测试测试赛");
	  //���뿨Ƭ���ݺ󣬵������ӡ���ť
	  driver.findElement(By.xpath(".//*[@id='block_17d4d69c21ed4e0e']/div[1]/div[1]/div[3]/button[1]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //��ȡ������ť
	  driver.findElement(By.xpath(".//*[@id='block_17d4d69c21ed4e0e']/div[1]/div[2]/div[3]/button[2]")).click();
	  //打开已经新建卡片
	  driver.findElement(By.xpath("//div[@id='block_17d4d69c21ed4e0e']/div/div[1]")).click();
	  
	  //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  //点击新增成员按钮
	  driver.findElement(By.xpath(".//div[@id='divEditButtonGroup']/div[1]/button")).click();
	  //选择人员
	  driver.findElement(By.xpath(".//*[@id='divAddUser']/div[3]/ul/li[1]/div/span[2]")).click();
	  //关闭选择成员弹出框
	  driver.findElement(By.xpath(".//*[@id='divAddUser']/div[1]/button")).click();
	  //点击标签选择按钮
	  driver.findElement(By.xpath(".//div[@id='divEditButtonGroup']/div[2]/button")).click();	  
	  //选择标签颜色
	  driver.findElement(By.xpath(".//*[@id='divColorList_tag']/div[1]/ul/li[3]/div")).click();
	  //关闭选择标签页
	  driver.findElement(By.xpath(".//*[@id='divAddOrSetTag']/div[1]/button[2]")).click();
	  //点击工作量按钮
	  driver.findElement(By.xpath(".//*[@id='estimate_work_btn']")).click();
	  //选择工作量按钮
	  driver.findElement(By.xpath(".//*[@id='divWorkEstimate']/div[2]/ul/li[6]/a")).click();
	  //点击关闭工作量弹出框
	  driver.findElement(By.xpath(".//*[@id='divWorkEstimate']/div[2]/ul/li[6]/a")).click();
	  //点击截止时间
	  driver.findElement(By.xpath(".//*[@id='btnDeadline']")).click();
	  //点击截止时间中保存按钮
	  driver.findElement(By.xpath(".//*[@id='datetime_picker']/div/div[3]/table/tfoot/tr/th[1]/button")).click();
	  //关闭卡片
	  driver.findElement(By.xpath(".//*[@id='divTaskEdit']/button")).click();
	  
	  //删除新建的卡片
	  driver.findElement(By.xpath(".//div[@id='block_17d4d69c21ed4e0e']/div[1]/div[1]/div[1]/span[2]")).click();
	  
//	  driver.findElement(By.xpath(".//*[@id='tabPaneEmail']/div[4]/button")).click();
//	  
//	  driver.findElement(By.xpath(".//*[@id='list_6616306']/div/div[1]/a")).click();
//	  
//	  driver.findElement(By.xpath(".//*[@id='list_6559802']/div/div[1]/a/span")).click();
	  
  }
  @AfterTest
  public void AfterTestDemo() {
	  
	  	  
  }
}
