package jUnitTestingpackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ TestAddNumbers.class, TestAddStrings.class })
public class AllTests {

	
}
