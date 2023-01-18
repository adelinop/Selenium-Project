package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.AddRemoveElements;
import exceptions.ErrorException;

public class AddRemoveElementsPage extends BasePage {
	AddRemoveElements addRemoveElements;

	public AddRemoveElementsPage(WebDriver driver) {
		super(driver);
		addRemoveElements = new AddRemoveElements();
	}
	public void addNewElement() throws Exception {
		click(addRemoveElements.addElementButton);
	}
	
	public void removeFirstElementList() {
		try {
			List<WebElement> buttonRemoveList = driver.findElements(addRemoveElements.removeButtonList); 
			buttonRemoveList.get(0).click();
		}catch(Exception e) {
			
		}
	}
	
	public void validateIfButtonIsNotPresent() throws ErrorException {
		List<WebElement> buttonRemoveList = driver.findElements(addRemoveElements.removeButtonList);
		if(buttonRemoveList.size()!=0) {
			throw new ErrorException(addRemoveElements.removeButtonList, "validateIfButtonIsNotPresent");
		}
	}
}
