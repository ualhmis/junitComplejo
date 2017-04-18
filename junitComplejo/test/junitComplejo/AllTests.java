package junitComplejo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ComplejoTest.class, ComplejoTest2.class, ComplejoTestParametrized.class })
public class AllTests {

}
