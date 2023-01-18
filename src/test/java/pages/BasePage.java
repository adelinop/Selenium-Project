package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;
import exceptions.ErrorException;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By element) throws Exception {
	try {
		waitTime(Constants.BASE_WAIT_TIME, element);
		driver.findElement(element).click();
	}catch(Exception e) {
		throw new ErrorException( element,  "Click in element");
	}
	}

	public void write(By element, String text) throws Exception {
		try {
			click(element);
			driver.findElement(element).clear();
			driver.findElement(element).sendKeys(text);
		} catch (Exception e) {
			throw new ErrorException(element, "Write");
		}
	}

	public void writeCharByChar(By element, String text) throws Exception {
		try {
			click(element);
			driver.findElement(element).clear();
			char[] myChars = text.toCharArray();
			for (int i = 0; i < myChars.length; i++) {
				driver.findElement(element).sendKeys(new String(myChars[i] + ""));
				Thread.sleep(500);
			}
		} catch (Exception e) {
			throw new ErrorException(element, "Write char by char");
		}
	}

	public void waitTime(Integer time, By element) throws Exception {
		for (int i = 0; i < Constants.TRIES; i++) {
			try {
				wait = new WebDriverWait(driver, Duration.ofSeconds(time));
				wait.until(ExpectedConditions.elementToBeClickable(element));
				if (isPresent(element)) {
					break;
				}
			} catch (Exception e) {
				System.out.println("Element isn't present " + i);
			}
		}
		if (!isPresent(element)) {
			throw new ErrorException(element, "Wait Element");
		}
	}

	public void waitTime(By element) throws Exception {
		try {
			for (int i = 0; i < Constants.TRIES; i++) {
				try {
					wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.BASE_WAIT_TIME));
					wait.until(ExpectedConditions.elementToBeClickable(element));
					if (isPresent(element)) {
						break;
					}
				} catch (Exception e) {
					System.out.println("Element not found " + i);
				}
			}
		} catch (Exception e) {
			throw new ErrorException(element, "Wait Element");
		}
	}

	public boolean isPresent(By element) throws Exception {
		try {
			if (driver.findElement(element).isDisplayed()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("Element not found");
		}
		return false;
	}

	public String getText(By element) throws ErrorException {
		try {
			waitTime(Constants.BASE_WAIT_TIME, element);
			return driver.findElement(element).getText();
		} catch (Exception e) {
			throw new ErrorException(element, "get Text");
		}
	}
}
