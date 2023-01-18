package core;

import org.junit.Test;

import pages.ABPage;
import pages.HomePage;

public class AUR_T1_abTest extends BaseTest{
	HomePage homePage;
	ABPage abPage;
	public  AUR_T1_abTest() {
		homePage =  new HomePage(driver);
		abPage = new ABPage(driver);
	}
	@Test
	public void test() throws Exception {
		homePage.accessMenuByText("A/B");
		abPage.validateParagraphLoad();
	}
}
