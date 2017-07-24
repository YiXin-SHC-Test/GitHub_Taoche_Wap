package Taoche.Wap.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Taoche.Wap.Util.ObjectMap;

public class TaocheListPage {
	private WebElement element;
	// 指定页面元素定位表达式配置文件的相对文件路径
	private ObjectMap objectMap = new ObjectMap("config/objectMap.properties");
	private WebDriver driver;

	public TaocheListPage(WebDriver driver) {
		this.driver = driver;
	}
	
}
