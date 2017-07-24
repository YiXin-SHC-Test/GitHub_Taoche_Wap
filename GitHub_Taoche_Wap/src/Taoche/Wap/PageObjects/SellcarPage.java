package Taoche.Wap.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Taoche.Wap.Util.ObjectMap;

public class SellcarPage {
	private WebElement element = null;
	// 指定页面元素定位表达式配置文件的相对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private WebDriver driver;

	public SellcarPage(WebDriver driver) {
		this.driver = driver;
	}

	// 上传图片
	public WebElement UploadPicID1() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于UploadPicID1的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.UploadPicID1"));
		return element;
	}

	// 车型名称
	public WebElement CarName() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarName的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.CarName"));
		return element;
	}

	// 车品牌
	public WebElement CarPinpai() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarPinpai的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.CarPinpai"));
		return element;
	}

	// 车系
	public WebElement CarChexi() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarChexi的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.CarChexi"));
		return element;
	}

	// 车型
	public WebElement CarChexing() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarChexing的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.CarChexing"));
		return element;
	}

	// 上牌日期
	public WebElement LicenseTime() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于LicenseTime的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.LicenseTime"));
		return element;
	}

	// 年份
	public WebElement Year() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Year的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.Year"));
		return element;
	}

	// 月份
	public WebElement Month() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Month的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.Month"));
		return element;
	}

	// 上牌区域
	public WebElement LicenseArea() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于LicenseArea的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.LicenseArea"));
		return element;
	}

	// 上牌省
	public WebElement Province() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarChexing的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.Province"));
		return element;
	}

	// 上牌市
	public WebElement City() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于City的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.City"));
		return element;
	}

	// 行驶公里
	public WebElement KM() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于KM的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.KM"));
		return element;
	}

	// 颜色
	public WebElement Color() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Color的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.Color"));
		return element;
	}

	// 车颜色
	public WebElement CarColor() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarColor的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.CarColor"));
		return element;
	}

	// 钱
	public WebElement Carmoney() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Carmoney的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.Carmoney"));
		return element;
	}

	// 姓名
	public WebElement Username() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于Username的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.Username"));
		return element;
	}

	// 电话
	public WebElement UserMobile() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于UserMobile的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.UserMobile"));
		return element;
	}

	// 所在省市
	public WebElement CarArea() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarArea的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.CarArea"));
		return element;
	}

	// 上牌省
	public WebElement CarAreaProvince() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarAreaProvince的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.CarAreaProvince"));
		return element;
	}

	// 城市地区
	public WebElement CarAreaCity() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于CarAreaCity的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.CarAreaCity"));
		return element;
	}

	// ---
	public WebElement DayForm() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于DayForm的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.DayForm"));
		return element;
	}

	// 发布按钮
	public WebElement SetButton() throws Exception {
		// 使用objectMap类中的getLocator方法获取配置文件中关于SetButton的定位方式和定位表达式
		element = driver.findElement(objectMap
				.getLocator("taoche.SellcarPage.SetButton"));
		return element;
	}
}
