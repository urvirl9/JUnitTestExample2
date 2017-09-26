package jUnitTestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestAddNumbers {

	
	
	@Test
	public void test() {
		jUnitTesting junit=new jUnitTesting();
		int result = junit.addNumbers(100, 200);
		assertEquals(300,result);
	}

}
