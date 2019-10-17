import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class ConcatTest {

	@Test
	public void test() {
		MultiplyConcat test = new MultiplyConcat();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo", result);
	}

}
