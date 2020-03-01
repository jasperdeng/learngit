package meituan;

import static org.junit.Assert.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class junit {
	private AppiumDriver driver;
	@Before
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

		driver= new AndroidDriver(remoteUrl, desiredCapabilities) ;
	}

	@Test
	public void test() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.view.View[@content-desc='外卖']")
				.click();
		driver.findElementByXPath("//*[@text=‘优惠套餐’]").click();
		System.out.println("测试第一次");
		System.out.println("nihao");
	}

}
