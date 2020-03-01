package meituan;

import static org.testng.Assert.assertEquals;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.awt.Label;
import java.util.*;
import java.awt.dnd.peer.DropTargetPeer;
import java.lang.invoke.LambdaConversionException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.swing.MenuElement;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.jetty.html.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testng {

	private AppiumDriver driver;

	// private FluentWait<WebDriver> wait;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities
				.setCapability("app",
						"D:\\Users\\Administrator\\auto test\\group-1000060401_1-meituan.apk");
		desiredCapabilities.setCapability("appActivity",
				"com.meituan.android.pt.homepage.activity.MainActivity");
		desiredCapabilities.setCapability("noReset", true);
		desiredCapabilities.setCapability("deviceName", "127.0.0.1:5555");

		desiredCapabilities.setCapability("automationName", "uiautomator2");

		URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);

	}

	@Test
	public void login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.view.View[@content-desc='美食']")
				.click();
		List <WebElement> elemsList = driver.findElementsById("com.sankuai.meituan:id/food_home_header_hot_item_shade");
		elemsList.get(0).click();
   //driver.findElementByXPath("//android.widget.FrameLayout[]/child::android.widget.TextView[@text='优惠套餐']").isDisplayed();
		System.out.println("测试第一次");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
