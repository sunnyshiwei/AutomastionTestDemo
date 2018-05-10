package TestForAnsteel;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmentable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class TestForAnsteel {

	WebDriver driver;
	// 鼠标Action执行鼠标左击,右击,双击,悬停操作
	// 创建动作对象，并且指定操作的浏览器
	Actions actions;

	@BeforeTest
	public void beforeTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");

		driver = new FirefoxDriver();

		driver.navigate().to("http://192.168.31.221:41003/icwfrontend/index.html");

		Thread.sleep(10000);

		driver.manage().window().maximize();

	}

	public void loginTest() {

		// 定位用户名并传值
		driver.findElement(By.xpath("//div[@class='input-group mb-3']/input")).click();
		driver.findElement(By.xpath("//div[@class='input-group mb-3']/input")).sendKeys("admin");

		// 定位密码并传值
		driver.findElement(By.xpath("//div[@class='input-group mb-4']/input")).click();
		driver.findElement(By.xpath("//div[@class='input-group mb-4']/input")).sendKeys("123456");

		// 定位登录按钮并点击
		driver.findElement(By.xpath("//div[@class='login-page-panel']/div[7]/button")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void uploadFiles(){
		
		//File file = new File("C:/Users/Administrator/Desktop/test001.jpg");
		//File file = new File("C:\\Users\\happy\\Desktop\\FileUpload.html");
	        // 用java来实现文件读取功 \
	    //String filePath="C:/Users/Administrator/Desktop/test001.jpg";
		//File file = new File(filePath);
		//driver.get(file.getAbsolutePath());
		//driver.get(file.getAbsolutePath());
		//driver.findElement(By.xpath("//div/p-fileupload/div/div[1]/span/input")).click();
		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
		// Java 的Runtime 模块的getruntime.exec()方法可以调用exe 程序并执行。
		Runtime exe= Runtime.getRuntime();
		 
		try {
			String str= "F:\\selenium\\TestForUploadFile\\testAutoIt.exe";
			//运行指定位置的.exe文件
			exe.exec(str);
			
		} catch (Exception e) {
			System.out.println("Error to run the exe");
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

	@Test(enabled = false)
	public void userInfoTest() {

		String userName = "autoTestDemo";
		String userEmail = "testAutomation@163.com";
		String realName = "石微测试自动化";

		actions = new Actions(driver);

		loginTest();

		// 切换园区
		driver.findElement(By.linkText("物流园二区")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-item']/i[@class='fa fa-tasks']")).click();

		// 切入权限管理菜单
		driver.findElement(By.linkText("权限管理")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 切入用户信息维护菜单
		driver.findElement(By.linkText("用户信息维护")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 点击新增按钮
		driver.findElement(By.xpath("//div[@class='ui-toolbar-group-right']/button[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 定位用户名元素位置，并输入用户名
		driver.findElement(By.xpath("//p-dialog/div/div[2]/div/div[1]/div/div/input")).click();
		driver.findElement(By.xpath("//p-dialog/div/div[2]/div/div[1]/div/div/input")).sendKeys(userName);

		// 定位邮箱元素位置，并输入邮箱
		driver.findElement(By.xpath("//div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys(userEmail);

		// 定位姓名元素为止，并输入姓名
		driver.findElement(By.xpath("//div[3]/div/div/input")).click();
		driver.findElement(By.xpath("//div[3]/div/div/input")).sendKeys(realName);

		// 定位用户角色系统管理员checkbox
		driver.findElement(By.xpath("//p-checkbox/div/div[2]")).click();
		// driver.findElement(By.xpath("//p-checkbox/div/div[2]")).isSelected();

		// 定位区域下拉框
		driver.findElement(By.xpath("//div[5]/div/div/p-dropdown/div/div[3]")).click();
		driver.findElement(By.xpath("//div[5]/div/div/p-dropdown/div/div[4]/div/ul/li[6]")).click();

		// 定位工种/职工元素，并选择下拉框内容
		driver.findElement(By.xpath("//div[6]/div/div/p-dropdown/div/div[3]")).click();
		driver.findElement(By.xpath("//div[6]/div/div/p-dropdown/div/div[4]/div/ul/li[3]")).click();

		// 定位密码元素，并输入
		driver.findElement(By.xpath("//div[2]/div/div[7]/div/div/input")).click();
		driver.findElement(By.xpath("//div[2]/div/div[7]/div/div/input")).sendKeys("111111");

		// 定位确认密码元素，并输入值
		driver.findElement(By.xpath(".//*[@id='comPassword']")).click();
		driver.findElement(By.xpath(".//*[@id='comPassword']")).sendKeys("111111");

		// 定位保存按钮元素
		driver.findElement(By.xpath("//p-footer/button[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 查询元素
		driver.findElement(By.xpath("//p-header/div/div/div[1]/div/input")).click();
		driver.findElement(By.xpath("//p-header/div/div/div[1]/div/input")).sendKeys(userName);
		driver.findElement(By.xpath("//p-header/div/div/div[2]/div/button")).click();

		// 清空查询条件
		driver.findElement(By.xpath("//span[@class='ui-inputgroup-addon']/i[@class='fa fa-close']")).click();
		driver.findElement(By.xpath("//p-header/div/div/div[2]/div/button")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 双击列表数据，并进行修改数据
		WebElement userNameTable = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span[2]"));
		// 单击操作并传入参数，perform（）提交并生效
		// actions.click(userNameTable).perform();

		// 左键双击操作，perform（）提交并生效
		actions.doubleClick(userNameTable).perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// //右键单击操纵，perform（）提交并生效
		// actions.contextClick(userNameTable).perform();
		WebElement deleteElement = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span[2]"));
		// 双击要删除的元素
		actions.click(deleteElement).perform();
		// 点击删除按钮，确定按钮
		driver.findElement(By.xpath("//p-footer/div/div/button[2]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//p-confirmdialog/div/div[3]/p-footer/button[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	//(dependsOnMethods={"userInfoTest"})
	public void userRegisterTest() {		
		
		// 点击在线注册
		driver.findElement(By.linkText("在线注册")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 选择注册类型
		driver.findElement(By.xpath("//p-dropdown/div/div[3]/span")).click();
		// 选择注册类型“德邻云仓”
		driver.findElement(By.xpath("//p-dropdown/div/div[4]/div/ul/li[1]")).click();
		// 定位用户名称输入框
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div/div[2]/div[2]/input")).click();
		// 输入用户名称
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div/div[2]/div[2]/input"))
				.sendKeys("sunnyAutomationTest");

		// 定位密码输入框
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div/div[3]/div[2]/input")).click();
		// 输入秘密
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div/div[3]/div[2]/input"))
				.sendKeys("111111");
		// 定位确认秘密输入框
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div/div[4]/div[2]/input")).click();
		// 输入确认密码
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div/div[4]/div[2]/input"))
				.sendKeys("111111");

		// 定位地区下拉框
		driver.findElement(By.xpath("//div[5]/div[2]/p-dropdown/div/div[3]/span")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// 选择“鞍山”地区
		driver.findElement(By.xpath("//div[5]/div[2]/p-dropdown/div/div[4]/div/ul/li[5]")).click();
		// 选择‘下一步’按钮
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div/div[6]/button[1]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//选择‘仓储名称’下拉框
		driver.findElement(By.xpath("//div[2]/p-dropdown/div/div[3]/span")).click();		
		//选择物流园
		driver.findElement(By.xpath("//div[2]/p-dropdown/div/div[4]/div[2]/ul/li[1]")).click();
		//选择‘运输方式’下拉框
		driver.findElement(By.xpath("//div[4]/p-dropdown/div/div[3]/span")).click();
		//选择‘运输方式：铁运’
		driver.findElement(By.xpath("//div[4]/p-dropdown/div/div[4]/div[2]/ul/li[2]")).click();
		//定位客户名称输入框
		driver.findElement(By.xpath("//app-register-type-1/div/div[6]/input")).click();
		//输入客户名称名称
		driver.findElement(By.xpath("//app-register-type-1/div/div[6]/input")).sendKeys("测试客户名称");
		//定位姓名输入框
		driver.findElement(By.xpath("//app-register-type-1/div/div[8]/input")).click();
		//输入姓名输入框
		driver.findElement(By.xpath("//app-register-type-1/div/div[8]/input")).sendKeys("测试姓名");
		//定位联系人电话
		driver.findElement(By.xpath("//app-register-type-1/div/div[10]/input")).click();
		//输入联系人电话
		driver.findElement(By.xpath("//app-register-type-1/div/div[10]/input")).sendKeys("1399999999");
		//定位年吞吐量
		driver.findElement(By.xpath("//app-register-type-1/div/div[14]/div/input")).click();
		//输入年吞吐量
		driver.findElement(By.xpath("//app-register-type-1/div/div[14]/div/input")).sendKeys("7983743.555");
		//选择仓库类型下拉框
		driver.findElement(By.xpath("//div[12]/p-dropdown/div/div[3]/span")).click();
		//仓库类型选择‘自营库’
		driver.findElement(By.xpath("//div[12]/p-dropdown/div/div[4]/div[2]/ul/li[1]")).click();
		//选择仓库规模下拉框
		driver.findElement(By.xpath("//div[18]/p-dropdown/div/div[3]/span")).click();
		//选择仓库规模100到200
		driver.findElement(By.xpath("//div[18]/p-dropdown/div/div[4]/div[2]/ul/li[3]")).click();
		//选择品种下拉框
		driver.findElement(By.xpath("//div[20]/p-dropdown/div/div[3]/span")).click();
		//选择品种‘钢材’
		driver.findElement(By.xpath("//div[20]/p-dropdown/div/div[4]/div[2]/ul/li[2]")).click();
		//详细地址定位
		driver.findElement(By.xpath("//app-register-type-1/div/div[22]/input")).click();
		//输入详细地址
		driver.findElement(By.xpath("//app-register-type-1/div/div[22]/input")).sendKeys("辽宁省大连市高新园区腾讯大厦");
		//定位营业执照号码
		driver.findElement(By.xpath("//app-register-type-1/div/div[24]/input")).click();
		//输入营业执照号码
		driver.findElement(By.xpath("//app-register-type-1/div/div[24]/input")).sendKeys("87432974438888888");
		//定位并输入注册资金
		driver.findElement(By.xpath("//app-register-type-1/div/div[26]/input")).click();
		driver.findElement(By.xpath("//app-register-type-1/div/div[26]/input")).sendKeys("3454543543");
		//定位并输入税务资金		
		driver.findElement(By.xpath("//app-register-type-1/div/div[28]/input")).click();
		driver.findElement(By.xpath("//app-register-type-1/div/div[28]/input")).sendKeys("33333333333");
		//定位并输入仓库办公室电话:
		driver.findElement(By.xpath("//app-register-type-1/div/div[30]/input")).click();
		driver.findElement(By.xpath("//app-register-type-1/div/div[30]/input")).sendKeys("041144448888");
		//定位并输入企业法人名称:
		driver.findElement(By.xpath("//app-register-type-1/div/div[32]/input")).click();
		driver.findElement(By.xpath("//app-register-type-1/div/div[32]/input")).sendKeys("法人名称测试");
		//定位并输入企业法人身份证号
		driver.findElement(By.xpath("//app-register-type-1/div/div[34]/input")).click();
		driver.findElement(By.xpath("//app-register-type-1/div/div[34]/input")).sendKeys("210921222222222222");
		//定位并输入对公账户开户行:
		driver.findElement(By.xpath("//app-register-type-1/div/div[36]/input")).click();
		driver.findElement(By.xpath("//app-register-type-1/div/div[36]/input")).sendKeys("888888888444");
		//定位并输入对公账户账号:
		driver.findElement(By.xpath("//app-register-type-1/div/div[38]/input")).click();
		driver.findElement(By.xpath("//app-register-type-1/div/div[38]/input")).sendKeys("788888857485");
		//定位并办理纳税人识别号:
		driver.findElement(By.xpath("//app-register-type-1/div/div[40]/input")).click();
		driver.findElement(By.xpath("//app-register-type-1/div/div[40]/input")).sendKeys("0000009999999");
		//定位并输入公司传真
		driver.findElement(By.xpath("//app-register-type-1/div/div[42]/input")).click();
		driver.findElement(By.xpath("//app-register-type-1/div/div[42]/input")).sendKeys("041199998888");
		//定位并选择三证合一（否）
		driver.findElement(By.xpath("//p-radiobutton[2]/div/div[2]/span")).click();
		//定位并输入统一社会信用代码:
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[4]/input")).click();
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[4]/input")).sendKeys("2343333333333");;
		//统一社会信用代码注册时间:
		driver.findElement(By.xpath("//div[2]/p-calendar/span/input")).click();
		//时间选择当前日期
		driver.findElement(By.xpath("//div[2]/p-calendar/span/div/table/tbody/tr[1]/td[6]/a")).click();
		//统一社会信用代码有效期至:
		driver.findElement(By.xpath("//div[4]/p-calendar/span/input")).click();
		driver.findElement(By.xpath("//div[4]/p-calendar/span/div/table/tbody/tr[1]/td[6]/a")).click();

		//点击“选择文件”按钮,并上传文件
		driver.findElement(By.xpath("//p-fileupload/div/div[1]/span/input")).sendKeys("C:\\Users\\Administrator\\Desktop\\test001.jpg");
		//点击‘开始上传’按钮
		driver.findElement(By.xpath("//p-fileupload/div/div[1]/button")).click();
		//点击提交按钮
		driver.findElement(By.xpath("//app-icw-register/div/div[2]/div/div/div/div/div[3]/button[1]")).click();
		//uploadFiles();
		
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
	public void AfterTest() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

		//driver.close();

	}
}
