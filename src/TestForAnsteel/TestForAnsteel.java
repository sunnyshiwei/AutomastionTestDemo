package TestForAnsteel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmentable;
import org.testng.annotations.AfterTest;

public class TestForAnsteel {

	WebDriver driver;

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
	public void authorityManageTest() throws InterruptedException {
		//切入权限管理菜单
		driver.findElement(By.linkText("权限管理")).click();
		Thread.sleep(1000);
		
		//切入用户信息维护菜单
		driver.findElement(By.linkText("用户信息维护")).click();
		Thread.sleep(3000);
		
		//点击新增按钮
		driver.findElement(By.xpath("//div[@class='ui-toolbar-group-right']/button[1]")).click();
		Thread.sleep(2000);
		
		//定位用户名元素位置，并输入用户名
		driver.findElement(By.xpath("//p-dialog/div/div[2]/div/div[1]/div/div/input")).click();		
		driver.findElement(By.xpath("//p-dialog/div/div[2]/div/div[1]/div/div/input")).sendKeys("自动化测试用户名");
		
		//定位邮箱元素位置，并输入邮箱		
		driver.findElement(By.xpath("//div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("testAutomation@163.com");
		
		//定位姓名元素为止，并输入姓名
		driver.findElement(By.xpath("//div[3]/div/div/input")).click();
		driver.findElement(By.xpath("//div[3]/div/div/input")).sendKeys("石微测试自动化");
		
		//定位用户角色系统管理员checkbox
		driver.findElement(By.xpath("//p-checkbox/div/div[2]")).click();		
		//driver.findElement(By.xpath("//p-checkbox/div/div[2]")).isSelected();
		
		//定位区域下拉框	
		driver.findElement(By.xpath("//div[5]/div/div/p-dropdown/div/div[3]")).click();
		driver.findElement(By.xpath("//div[5]/div/div/p-dropdown/div/div[4]/div/ul/li[6]")).click();
		
		//定位工种/职工元素，并选择下拉框内容
		driver.findElement(By.xpath("//div[6]/div/div/p-dropdown/div/div[3]")).click();
		driver.findElement(By.xpath("//div[6]/div/div/p-dropdown/div/div[4]/div/ul/li[3]")).click();
		
		

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
	public void afterTest() {
	}

}
