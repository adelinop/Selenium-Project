package pages;

import org.openqa.selenium.WebDriver;

import elements.ABElement;
import exceptions.ErrorException;

public class ABPage extends BasePage{
	ABElement abElement;
	public ABPage(WebDriver driver) {
		super(driver);
		abElement = new ABElement();
	}
	
	public void validateParagraphLoad () throws Exception {
		if(!isPresent(abElement.paragraph)) {
			throw new ErrorException(abElement.paragraph, "Validate Paragraph");
		}
	}

}
