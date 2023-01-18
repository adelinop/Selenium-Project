package pages;

import org.openqa.selenium.WebDriver;

import constants.Constants;
import elements.BasicAuthElement;
import exceptions.ErrorException;

public class BasicAuthPage extends BasePage{
	BasicAuthElement basicAuthElement;
	public BasicAuthPage(WebDriver driver) {
		super(driver);
		basicAuthElement = new BasicAuthElement();
	}
	
	public void acessAuthLink() {
		driver.get("https://"+Constants.USER + ":" + Constants.PASSWORD + "@" + Constants.BASE_URL+ "basic_auth");
		
	}
	public void validateTitlePresent() throws Exception {
		if(!isPresent(BasicAuthElement.basicAuthTitle)) {
			 throw new ErrorException(BasicAuthElement.basicAuthTitle, "Basic Auth Title");
		}
	}
}
