package Taoche.Wap.TestScripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Taoche.Wap.Util.WaitUtil;

@Test

public class CItyPage {
	WebDriver driver;
	public void citypage() 
	{
		//查看淘车下载app是否展示
		WebElement TaocheAppLoad=driver.findElement(By.id("app-mask"));
		Assert.assertTrue(TaocheAppLoad.isDisplayed());
		driver.findElement(By.id("app-colse")).click();
		//查看地点显示
		WebElement cityElement=driver.findElement(By.id("currentcity"));
		String cityText=cityElement.getText();	
		Assert.assertEquals("北京", cityText);
		cityElement.click();
		WaitUtil.sleep(3000);
		driver.findElement(By.xpath("//a[text()='天津']")).click();
		System.out.println("切换城市成功");
		WaitUtil.sleep(5000);
		WebElement cityElement1=driver.findElement(By.id("currentcity"));
		String cityText1=cityElement1.getText();
		Assert.assertEquals("天津", cityText1);
		WebElement newcarTabElement=driver.findElement(By.xpath("//a[text()='新车']"));
		Assert.assertTrue(newcarTabElement.isDisplayed());
		newcarTabElement.click();
		WebElement newcarpinpaiElement=driver.findElement(By.xpath("//p[text()='大众']"));
		Assert.assertTrue(newcarpinpaiElement.isDisplayed());
		newcarpinpaiElement.click();
		
		
				
	}
	// 打开浏览器
	@BeforeMethod
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.get("http://m.taoche.com/");
	}

	// 关闭浏览器
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

