import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {
	
	@BeforeTest
	public void setup() {
		throw new SkipException("Skip");
	}
	
	@Test
	public void test1() { }

	@Test(dependsOnMethods = {"test1"})
	public void test2() { }
}
