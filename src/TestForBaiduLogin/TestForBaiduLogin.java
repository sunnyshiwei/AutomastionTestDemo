package TestForBaiduLogin;

import org.testng.annotations.Test;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeTest;


public class TestForBaiduLogin {

	WebDriver driver;

	@BeforeTest
	public void dd() {

		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");

		driver = new FirefoxDriver();

		driver.navigate().to("https://www.baidu.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}
	
	@Test
	public void f() {
		// 定位到登录输入框

		driver.findElement(By.xpath(".//div[@id='u1']/a[7]")).click();

		// if(driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).isEnabled()){
		//
		// driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
		//
		// }
		//
		driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();

		// List<WebElement> inputElement=
		// driver.findElements(By.tagName("input"));
		//
		// for(WebElement input:inputElement){
		// if (input.getAttribute("id").equals("TANGRAM__PSP_10__userName")){
		// input.findElement(By.id("TANGRAM__PSP_10__userName")).click();
		// }
		// }
		// 用户名输入
		driver.findElement(By.id("TANGRAM__PSP_10__userName")).click();
		driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("13998538053");
		// 密码输入
		driver.findElement(By.id("TANGRAM__PSP_10__password")).click();
		driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("ww744934");
		// 点击登录按钮
		// driver.findElement(By.className("input-groupmb-3")).findElement(By.tagName("input")).click();
		// 输入验证码
		// driver.findElement(By.id("TANGRAM__PSP_10__verifyCode")).click();

		// driver.findElement(By.id("TANGRAM__PSP_10__verifyCode")).sendKeys(driver.findElement(By.id("TANGRAM__PSP_10__verifyCodeImg")));

		// 定位验证码（图片）
		WebDriverWait wait = new WebDriverWait(driver, 3);

		// File
		// srcFile=((TakesScreenshot).driver).getScreenshotAs(OutputType.FILE);
		WebElement element = wait.until(new ExpectedCondition<WebElement>() {

			@Override
			public WebElement apply(WebDriver dr) {
				// TODO Auto-generated method stub
				return dr.findElement(By.id("TANGRAM__PSP_10__verifyCodeImg"));
				
			}

		});

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Point p = element.getLocation();
			int width = element.getSize().getWidth();
			int height = element.getSize().getHeight();
			new Rectangle(width, height);
			BufferedImage img = ImageIO.read(scrFile);
			BufferedImage dest = img.getSubimage(p.getX(), p.getY(), width, height);
			ImageIO.write(dest, "png", scrFile);

			Thread.sleep(1000);

			File fng = new File("F:/selenium/Test-save-image/genimage.png");

			if (fng.exists()) {
				fng.delete();
			}

			FileUtils.copyFile(scrFile, fng);

			Runtime rt = Runtime.getRuntime();

			rt.exec("cmd.exe /C tesseract.exe  F:/elenium/Test-save-image/genimage.png  F:/elenium/Test-save-image/genimage  -1");

			Thread.sleep(1000);

			File file = new File("F:/selenium/Test-save-image/genimage.txt");

			if (file.exists()) {
				// FileHandler fh = new FileHandler();
				// String s=((Object) fh).readAsString(file).trim();
				// System.out.println(s);
				InputStreamReader read = new InputStreamReader(new FileInputStream(file));// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					System.out.println(lineTxt);
				}
				read.close();
			} else {
				System.err.println("不存在");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
