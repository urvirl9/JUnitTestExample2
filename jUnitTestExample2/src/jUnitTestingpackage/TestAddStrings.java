package jUnitTestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		jUnitTesting junitstring=new jUnitTesting();
		String result=junitstring.addStrings("Urvi", "Latnekar");
		assertEquals("UrviLatnekar",result);
		
		
		
		
	}

}
