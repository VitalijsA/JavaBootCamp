package finalActivity;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{

	@BeforeClass
	protected void setUpBeforeClass() throws Exception {
		super.setUp();
	}

	@AfterClass
	public  void tearDownAfterClass() throws Exception {
		super.tearDown();
	}

	public void testAdd() {
		
		int a = 5;
		int b = 10;			
		//	Checks the sum of two (2) positive values
		assertEquals(15, (Calculator.add(a,b)));
		assertEquals(15, (Calculator.add(b,a)));		

		a = -5;		
		b = 10;		
		//	Checks the sum of a positive value and a negative value
		assertEquals(5, (Calculator.add(a,b)));
		assertEquals(5, (Calculator.add(b,a)));
		
		a = -5;		
		b = -10;		
		//	Checks the sum of two (2) negative values
		assertEquals(-15, (Calculator.add(a,b)));
		assertEquals(-15, (Calculator.add(b,a)));
	}
public void testSub() {
		
		int a = 3;
		int b = 2;			
		//	Checks the sub of two (2) positive values
		assertEquals(1, (Calculator.sub(a,b)));
		assertEquals(-1, (Calculator.sub(b,a)));		
		a = -5;		
		b = 10;		
		//	Checks the sub of a positive value and a negative value
		assertEquals(-15, (Calculator.sub(a,b)));
		assertEquals(15, (Calculator.sub(b,a)));
		
		a = -5;		
		b = -10;		
		//	Checks the sub of two (2) negative values
		assertEquals(5, (Calculator.sub(a,b)));
		assertEquals(-5, (Calculator.sub(b,a)));
	}
public void testMult() {
	
		double a = 5;
		double b = 10;			
		//	Checks the sum of two (2) positive values
		assertEquals(50, (Calculator.mult(a,b)),0);
		assertEquals(50, (Calculator.mult(b,a)),0);		
	
		a = -5;		
		b = 10;		
		//	Checks the sum of a positive value and a negative value
		assertEquals(-50, (Calculator.mult(a,b)),0);
		assertEquals(-50, (Calculator.mult(b,a)),0);
		
		a = -5;		
		b = -10;		
		//	Checks the sum of two (2) negative values
		assertEquals(50, (Calculator.mult(a,b)),0);
		assertEquals(50, (Calculator.mult(b,a)),0);
}
public void testDiv() {
	
		double a = 5;
		double b = 10;			
		//	Checks the sum of two (2) positive values
		assertEquals(0.5, (Calculator.div(a,b)),0);
		assertEquals(2.0, (Calculator.div(b,a)),0);		
	
		a = -9;		
		b = 3;		
		//	Checks the sum of a positive value and a negative value
		assertEquals(-3.0, (Calculator.div(a,b)),0);
		assertEquals(-0.33, (Calculator.div(b,a)),0.007);
		
		a = -5;		
		b = -10;		
		//	Checks the sum of two (2) negative values
		assertEquals(0.5, (Calculator.div(a,b)),0);
		assertEquals(2.0, (Calculator.div(b,a)),0);
}

	@Test
	public void testThrowException(){
		
		try {

			Calculator.add(2, 1);
			Calculator.sub(3, 3);
			Calculator.mult(0, 1);
			Calculator.div(1, 0);
			new Calculator();
				
		} catch (Exception e) {
			fail();
		}
		  catch (Error e) {
			fail();
		}

	}
}
