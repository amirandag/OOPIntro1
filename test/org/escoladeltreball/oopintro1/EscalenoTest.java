/**
 * 
 */
package org.escoladeltreball.oopintro1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw39442165
 *
 */
public class EscalenoTest {

	Escaleno escaleno;
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
		escaleno = new Escaleno(5,2,2,2);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		escaleno = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Escaleno#perimeter()}.
	 */
	@Test
	public final void testPerimeter() {
		assertEquals(9, escaleno.perimeter(),1.0e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Triangle#area()}.
	 */
	@Test
	public final void testArea() {
		assertEquals(5, escaleno.area(),1.0e-4);
	}

}
