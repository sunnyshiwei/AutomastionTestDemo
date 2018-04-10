package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG01 {

		@Test
		public void testAdd() {
			String str = "TestNG is working fine";
			assertEquals("TestNG is working fine", str);
		}
	
}

