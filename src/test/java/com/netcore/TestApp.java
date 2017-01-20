

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestApp {

	@Test
	public void test() {
		assertEquals("Hi", new App().showMsg());
	}

}
