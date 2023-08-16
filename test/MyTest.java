import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void test1() { }

	@Test(dependsOnMethods = {"test1"})
	public void test2() { }
}
