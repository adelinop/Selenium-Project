package core;

import org.junit.Test;

import pages.BasicAuthPage;
import pages.HomePage;

public class AUR_T3_BasicAuth extends BaseTest{
	HomePage homePage;
	BasicAuthPage basicAuthPage;
		public AUR_T3_BasicAuth() {
			homePage = new HomePage(driver);
			basicAuthPage =  new BasicAuthPage(driver);
		}
		
		@Test
		public void test() throws Exception {
			basicAuthPage.acessAuthLink();
			basicAuthPage.validateTitlePresent();

		}
}
