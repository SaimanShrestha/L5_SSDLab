package lab4;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
/**
 * Test class for testing triangle class methods
 */
public class TestMethod {
	
	@Test
	void isIsosceles()
	{
		Triangle tri = new Triangle(2,2,2);
		assertFalse(tri.isIsosceles());
		
	}
	
	@Test
	void isScalence() {
		Triangle tri = new Triangle();
		assertFalse(tri.isScalene());	
		
	}
	
	@Test
	void isEquilateral() {
		Triangle tri = new Triangle();
		assertTrue(tri.isEquilateral());
	}
	
	@ParameterizedTest
	@CsvSource({"2,4,9"})
	void getAverageLength(int a, int b, int c) {
		Triangle tri = new Triangle(a,b,c);
		assertEquals((a+b+c)/3,tri.getAverageLength());
//		System.out.println(tri.getAverageLength());
	}
	
	@RepeatedTest(5)
	void testIsScalence() {
		Triangle tri = new Triangle(3,4,5);
		assertTrue(tri.isScalene());	
		
	}
	
//	@ParameterizedTest
//	@CsvSource({"2,4,9"})
//	void testgetPerimeter(int a, int b, int c) {
//		Triangle tri = new Triangle();
//		tri.setSides(a,b,c);
//		assertEquals(a+b+c,tri.getPerimeter());
//		System.out.println(tri.getAverageLength());
//	}
//	

//	@ParameterizedTest
//	@CsvSource({"2,2,4","2,3,4","5,6,9"})
//	void testSetSides(int a, int b, int c) {
//		Triangle tri = new Triangle();
//		tri.setSides(a, b, c);
//		assertNotEquals(a+b+c,tri.getPerimeter());
//		System.out.println(tri.getPerimeter());
//		tri.setSides(a);	
//		assertTrue(tri.isEquilateral());
//		tri.setSides(b, c);
//		assertTrue(tri.isIsosceles());
//		
//	}
//	
	
	@Test
	void testCopy() {
		Triangle tri = new Triangle(9,9,9);
		Triangle tcopy = tri.copy();
		assertEquals(27,tcopy.getPerimeter());
		
			
			
		}
	}
	


