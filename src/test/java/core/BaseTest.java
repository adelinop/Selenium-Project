package core;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.Constants;

public class BaseTest {
	public static WebDriver driver;
	public String casoTeste;

	@Before
	public void before() throws Exception {
		try {

			driver.manage().window().maximize();
			driver.get("https://"+Constants.BASE_URL);
		} catch (Exception e) {
			throw new Exception("Error on Before test");
		}
	}

	@BeforeClass
	public static void beforeTests() {
		try {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@AfterClass
	public static void afterTest() throws Exception {
		if (driver != null) {
			driver.quit();
		} else {
			throw new Exception("Driver nulo");
		}
	}

	public WebDriver getDriver() throws Exception {
		if (driver != null) {
			return driver;
		} else {
			return null;
		}
	}
}
