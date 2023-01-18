package pages;

import org.openqa.selenium.WebDriver;

import elements.HomeElements;

public class HomePage  extends BasePage{
	HomeElements homeElements;
	public HomePage(WebDriver driver) {
		super(driver);
		homeElements =  new HomeElements();
	}
	
	public void accessMenuByText(String menuOption) throws Exception {
		click(homeElements.dynamicMenuLink(menuOption));
	}
	
}
