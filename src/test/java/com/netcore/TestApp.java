/**
 * 
 */
package com.netcore;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Swapnil Srivastav
 *
 */
public class TestApp  {

	@Test
	public void test() {
		assertEquals("Hi From Maven", new App().getMsg());
	}

}
