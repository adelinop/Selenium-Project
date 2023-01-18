package elements;

import org.openqa.selenium.By;

public class HomeElements {
	
	public By dynamicMenuLink(String value) {
		return By.xpath("//a[contains(text(),'"+value+"')]");
	}
}
