import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: naoto
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Thursday 25-05-2023 11:17
 */

/**
 * @author naoto
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1;
		int b = 2;
		int c = 3;
		Calculator cal = new Calculator();
		int actual= cal.add(a, b , c);
		int expected = 6;
		assertEquals(expected,actual);
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		int actual= cal.subtract(a, b);
		int expected = 5555;
		assertEquals(expected,actual);
	}
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 10;
		int b = 10;
		Calculator cal = new Calculator();
		int actual= cal.multiply(a, b);
		int expected = 100;
		assertEquals(expected,actual);
	}
	@Test
	public void testDevide() {
		int a = 120;
		int b = 6;
		Calculator cal = new Calculator();
		int actual = cal.devide(a, b);
		int expected = 20;
		assertEquals(expected,actual);
		
		
	}
	@Test
	public void testDevide0() {
		int a = 120;
		int b = 0;
		Calculator cal = new Calculator();
		int actual = cal.devide(a, b);
		int expected = 20;
		assertnotEquals(expected,actual);
		
		
	}

	/**
	 * @param expected
	 * @param actual
	 */
	private void assertnotEquals(int expected, int actual) {
		// TODO Auto-generated method stub
		
	}
}
