package Taoche.Wap.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import Taoche.Wap.PageObjects.SellcarPage;
import Taoche.Wap.Util.WaitUtil;

public class SecllCarPage_Test {
	WebDriver driver;
	String baseUrl = "http://m.taoche.com/sellcar/sellcar.aspx?source=1";

	@Test
	public void MCreateCar() throws Exception {
		SellcarPage sellcarPage = new SellcarPage(driver);
		//上传车辆照片
		sellcarPage.UploadPicID1().click();
		WaitUtil.sleep(2000);
		Runtime.getRuntime().exec("D:\\自动化\\test.exe");
		WaitUtil.sleep(2000);
		//选择车信息
		sellcarPage.CarName().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarPinpai().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarChexi().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarChexing().click();
		WaitUtil.sleep(2000);
		// 编辑上牌时间
		sellcarPage.LicenseTime().click();
		WaitUtil.sleep(2000);
		sellcarPage.Year().click();
		WaitUtil.sleep(2000);
		sellcarPage.Month().click();
		WaitUtil.sleep(2000);
		// 编辑上牌所在地
		sellcarPage.LicenseArea().click();
		WaitUtil.sleep(2000);
		sellcarPage.Province().click();
		WaitUtil.sleep(2000);
		sellcarPage.City().click();
		WaitUtil.sleep(2000);
		// 表显里程
		sellcarPage.KM().sendKeys("1");
		// 选择车颜色信息
		sellcarPage.Color().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarColor().click();
		WaitUtil.sleep(2000);
		// 预售价格
		sellcarPage.Carmoney().sendKeys("1");
		// 填写用户姓名
		sellcarPage.Username().sendKeys("测试");
		WaitUtil.sleep(2000);
		// 填写用户手机号
		sellcarPage.UserMobile().sendKeys("13333333333");
		// 选择用户所在城市
		sellcarPage.CarArea().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarAreaProvince().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarAreaCity().click();
		WaitUtil.sleep(2000);
		sellcarPage.DayForm().click();
		// 提交
		sellcarPage.SetButton().click();
		// 断言是否成功
		Assert.assertTrue(driver.getPageSource().contains("发布成功"));
		WaitUtil.sleep(3000);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		WaitUtil.sleep(3000);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
		driver.quit();
	}

}
