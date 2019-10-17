import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		MultiplyConcat test = new MultiplyConcat();
		int result = test.multiply(2, 15);
		assertEquals(30, result);
	}

}
