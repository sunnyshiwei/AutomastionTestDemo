package TestForAnsteel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmentable;
import org.testng.annotations.AfterTest;

public class TestForAnsteel {

	WebDriver driver;
	//鼠标Action执行鼠标左击,右击,双击,悬停操作
	//创建动作对象，并且指定操作的浏览器
	Actions actions;

	@BeforeTest
	public void beforeTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");

		
		driver = new FirefoxDriver();

		driver.navigate().to("http://192.168.31.221:41003/icwfrontend/index.html");

		Thread.sleep(10000);

		driver.manage().window().maximize();

		// 定位用户名并传值
		driver.findElement(By.xpath("//div[@class='input-group mb-3']/input")).click();
		driver.findElement(By.xpath("//div[@class='input-group mb-3']/input")).sendKeys("admin");

		// 定位密码并传值
		driver.findElement(By.xpath("//div[@class='input-group mb-4']/input")).click();
		driver.findElement(By.xpath("//div[@class='input-group mb-4']/input")).sendKeys("123456");

		// 定位登录按钮并点击
		driver.findElement(By.xpath("//div[@class='login-page-panel']/div[7]/button")).click();

		Thread.sleep(3000);

		// 切换园区
		driver.findElement(By.linkText("物流园二区")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-item']/i[@class='fa fa-tasks']")).click();

	}

	@Test
	public void authManageTest()  {
		
		String userName="autoTestDemo";
		String userEmail="testAutomation@163.com";
		String realName="石微测试自动化";
		
		actions= new Actions(driver);
		
		//切入权限管理菜单
		driver.findElement(By.linkText("权限管理")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//切入用户信息维护菜单
		driver.findElement(By.linkText("用户信息维护")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//点击新增按钮
		driver.findElement(By.xpath("//div[@class='ui-toolbar-group-right']/button[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//定位用户名元素位置，并输入用户名
		driver.findElement(By.xpath("//p-dialog/div/div[2]/div/div[1]/div/div/input")).click();		
		driver.findElement(By.xpath("//p-dialog/div/div[2]/div/div[1]/div/div/input")).sendKeys(userName);
		
		//定位邮箱元素位置，并输入邮箱		
		driver.findElement(By.xpath("//div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys(userEmail);
		
		//定位姓名元素为止，并输入姓名
		driver.findElement(By.xpath("//div[3]/div/div/input")).click();
		driver.findElement(By.xpath("//div[3]/div/div/input")).sendKeys(realName);
		
		//定位用户角色系统管理员checkbox
		driver.findElement(By.xpath("//p-checkbox/div/div[2]")).click();		
		//driver.findElement(By.xpath("//p-checkbox/div/div[2]")).isSelected();
		
		//定位区域下拉框	
		driver.findElement(By.xpath("//div[5]/div/div/p-dropdown/div/div[3]")).click();
		driver.findElement(By.xpath("//div[5]/div/div/p-dropdown/div/div[4]/div/ul/li[6]")).click();
		
		//定位工种/职工元素，并选择下拉框内容
		driver.findElement(By.xpath("//div[6]/div/div/p-dropdown/div/div[3]")).click();
		driver.findElement(By.xpath("//div[6]/div/div/p-dropdown/div/div[4]/div/ul/li[3]")).click();
		
		//定位密码元素，并输入
		driver.findElement(By.xpath("//div[2]/div/div[7]/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div[7]/div/div/input")).sendKeys("111111");
		
		//定位确认密码元素，并输入值
		driver.findElement(By.xpath(".//*[@id='comPassword']")).click();
		driver.findElement(By.xpath(".//*[@id='comPassword']")).sendKeys("111111");
		
		//定位保存按钮元素
		driver.findElement(By.xpath("//p-footer/button[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//查询元素
		driver.findElement(By.xpath("//p-header/div/div/div[1]/div/input")).click();
		driver.findElement(By.xpath("//p-header/div/div/div[1]/div/input")).sendKeys(userName);
		driver.findElement(By.xpath("//p-header/div/div/div[2]/div/button")).click();
		
		//清空查询条件
		driver.findElement(By.xpath("//span[@class='ui-inputgroup-addon']/i[@class='fa fa-close']")).click();
		driver.findElement(By.xpath("//p-header/div/div/div[2]/div/button")).click();
		
		//双击列表数据，并进行修改数据
		WebElement userNameTable=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span[2]"));
		//单击操作并传入参数，perform（）提交并生效
		//actions.click(userNameTable).perform();		
		
		//左键双击操作，perform（）提交并生效
		actions.doubleClick(userNameTable).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		//右键单击操纵，perform（）提交并生效
//		actions.contextClick(userNameTable).perform();
		
	} 
	// public void loginTest() throws InterruptedException {
	//
	// //定位用户名并传值
	// driver.findElement(By.xpath("//div[@class='input-group
	// mb-3']/input")).click();
	// driver.findElement(By.xpath("//div[@class='input-group
	// mb-3']/input")).sendKeys("admin");
	//
	// //定位密码并传值
	// driver.findElement(By.xpath("//div[@class='input-group
	// mb-4']/input")).click();
	// driver.findElement(By.xpath("//div[@class='input-group
	// mb-4']/input")).sendKeys("123456");
	//
	// //定位登录按钮并点击
	// driver.findElement(By.xpath("//div[@class='login-page-panel']/div[7]/button")).click();
	//
	// Thread.sleep(3000);
	// //切换园区
	//
	// driver.findElement(By.linkText("物流园二区")).click();
	// driver.findElement(By.xpath("//a[@class='dropdown-item']/i[@class='fa
	// fa-tasks']")).click();
	// }

	@AfterTest
	public void afterTest() throws InterruptedException {
		
		 WebElement deleteElement=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span[2]"));
		 //双击要删除的元素
		 actions.click(deleteElement).perform();
		 //点击删除按钮，确定按钮
		 driver.findElement(By.xpath("//p-footer/div/div/button[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//p-confirmdialog/div/div[3]/p-footer/button[1]")).click();
		 Thread.sleep(1000);
		 //driver.quit();		 
		 driver.close();
		
	}

}
