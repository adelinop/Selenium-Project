package core;

import org.junit.Test;

import pages.AddRemoveElementsPage;
import pages.HomePage;

public class AUR_T2_AddRemoveElements extends BaseTest{
	HomePage homePage;
	AddRemoveElementsPage addRemoveElementsPage;
		public AUR_T2_AddRemoveElements() {
			homePage = new HomePage(driver);
			addRemoveElementsPage =  new AddRemoveElementsPage(driver);
		}
		
		@Test
		public void test() throws Exception {
			homePage.accessMenuByText("Add/Remove Elements");
			addRemoveElementsPage.addNewElement();
			addRemoveElementsPage.removeFirstElementList();
			addRemoveElementsPage.validateIfButtonIsNotPresent();
		}
}
