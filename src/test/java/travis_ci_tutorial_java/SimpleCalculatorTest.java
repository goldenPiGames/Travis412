package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	SimpleCalculator calc;
	
	@Before
	public void makeCalc() {
		calc = new SimpleCalculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testSubtract() {
		assertEquals(calc.subtract(5, 3), 2);
	}

	@Test
	public void testMultiply() {
		assertEquals(calc.multiply(3, 4), 12);
	}

	@Test
	public void testDivide() {
		assertEquals(calc.divide(10, 2), 5);
	}

	@Test
	public void testDivideByZero() {
		int[] x = null;
		try {
			calc.divide(10, 0);
			fail("didn't throw");
		} catch (ArithmeticException e) {
			
		}
		
	}
}
