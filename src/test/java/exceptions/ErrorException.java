package exceptions;

import org.openqa.selenium.By;

public class ErrorException extends Exception {

	private static final long serialVersionUID = 2318517712706899836L;
	private static String DEFAULT_MSG = "Error in the step: ";

	/**
	 * Create a exception when the error occurs
	 * 
	 * @param element 
	 * 			Element that Selenium tried to manage
	 * @param errorMsg
	 * 			Error message
	 */
	public ErrorException(By element, String errorMsg) {
		super(DEFAULT_MSG + errorMsg + " - " + element);
	}
}
