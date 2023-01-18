package elements;

import org.openqa.selenium.By;

public class AddRemoveElements {
	public By addElementButton =  new By.ByXPath("//button[@onclick='addElement()']");
	public By removeButtonList = new By.ByXPath("//button[@class='added-manually']");
}
