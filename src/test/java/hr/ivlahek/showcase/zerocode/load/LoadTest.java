package hr.ivlahek.showcase.zerocode.load;

import hr.ivlahek.showcase.zerocode.uat.UatTest;
import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.core.runner.parallel.ZeroCodeLoadRunner;
import org.junit.runner.RunWith;

//which test is each spawned user execute
@TestMapping(testClass = UatTest.class, testMethod = "should_get_google_com")
//how many users are we going to spawn
@LoadWith("my_load_config.properties")
//run it with zero code load runner
@RunWith(ZeroCodeLoadRunner.class)
public class LoadTest {
}
