package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.AUR_T1_abTest;
import core.AUR_T2_AddRemoveElements;
import core.AUR_T3_BasicAuth;

@RunWith(Suite.class)
@SuiteClasses({ AUR_T1_abTest.class, AUR_T2_AddRemoveElements.class, AUR_T3_BasicAuth.class})
public class AllTests {

}
