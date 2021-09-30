import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleTest {
	// boundary testing 
	@Test
	void testTriangleMin() {
		Triangle t=new Triangle(1,1,1);	
		assertNotNull(t);
		assertTrue(t.isEquilateral());
	}	
	@Test
	void testTriangleMinMinusA() {
		try {
			Triangle t=new Triangle(0,1,1);
			fail("min value a is invalid but triangle is created");
		}
		catch(Exception e){
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
	@Test
	void testTriangleMinMinusB() {
		try {
			Triangle t=new Triangle(1,0,1);
			fail("min value b is invalid but triangle is created");
		}
		catch(Exception e){
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
	@Test
	void testTriangleMinMinusC() {
		try {
			Triangle t=new Triangle(1,1,0);
			fail("min value c is invalid but triangle is created");
		}
		catch(Exception e){
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
	//min plus test 
	@Test
	void testTriangleMinPlusA() {
		Triangle t=new Triangle(2,1,1);	
		assertNotNull(t);
		assertFalse(t.isTriangle());
	}
	@Test
	void testTriangleMinPlusB() {
		Triangle t=new Triangle(1,2,1);	
		assertNotNull(t);
		assertFalse(t.isTriangle());
	}
	@Test
	void testTriangleMinPlusC() {
		Triangle t=new Triangle(1,1,2);	
		assertNotNull(t);
		assertFalse(t.isTriangle());
	}
	@Test
	void testTriangleMax() {
		Triangle t=new Triangle(200,200,200);	
		assertNotNull(t);
		assertTrue(t.isEquilateral());
	}
	// max plus test 
	@Test
	void testTriangleMaxPlusA() {
		try {
			Triangle t=new Triangle(201,200,200);
			fail("max value a is invalid but triangle is created");
		}
		catch(Exception e){
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
	@Test
	void testTriangleMaxPlusB() {
		try {
			Triangle t=new Triangle(200,201,200);
			fail("max value b is invalid but triangle is created");
		}
		catch(Exception e){
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
	@Test
	void testTriangleMaxPlusC() {
		try {
			Triangle t=new Triangle(200,200,201);
			fail("max value c is invalid but triangle is created");
		}
		catch(Exception e){
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
	// max minus test 
	@Test
	void testTriangleMaxMinusA() {
		Triangle t=new Triangle(199,200,200);	
		assertNotNull(t);
		assertTrue(t.isIsosceles());
	}
	@Test
	void testTriangleMaxMinusB() {
		Triangle t=new Triangle(200,199,200);	
		assertNotNull(t);
		assertTrue(t.isIsosceles());
	}
	@Test
	void testTriangleMaxMinusC() {
		Triangle t=new Triangle(200,200,199);	
		assertNotNull(t);
		assertTrue(t.isIsosceles());
	}
	//nominal testing 
	@Test
	void testTriangleNomNotATriangle() {
		Triangle t=new Triangle(1,10,12);	
		assertNotNull(t);
		assertFalse(t.isTriangle());
	}
	// nom 
	@Test 
	void testTriangleNomisEquilateral() {
		Triangle t=new Triangle(10,10,10);	
		assertNotNull(t);
		assertTrue(t.isEquilateral());
	}
	//test 9,10,10 isNotEqulateral  max -
	@Test
	void testTriangleMinusAisEquilateral() {
		Triangle t=new Triangle(9,10,10);	
		assertNotNull(t);
		assertFalse(t.isEquilateral());
	}
	///robust testing and testing lines 141- max -
	// test 10,9,10 isNotWqualateral
	@Test
	void testTriangleMinusBisEquilateral() {
		Triangle t=new Triangle(10,9,10);	
		assertNotNull(t);
		assertFalse(t.isEquilateral());
	}
	// test 10,10,9 isNotWqualateral max minus  
	@Test
	void testTriangleMinusCisEquilateral() {
		Triangle t=new Triangle(10,10,9);	
		assertNotNull(t);
		assertFalse(t.isEquilateral());
	}
	//test 9,10,10 isNotEqulateral  max + min -
	@Test
	void testTrianglePlusAisEquilateral() {
		Triangle t=new Triangle(11,10,10);	
		assertNotNull(t);
		assertFalse(t.isEquilateral());
	}
	// test 10,9,10 isNotWqualateral max + min -
	@Test
	void testTrianglePlusBisEquilateral() {
		Triangle t=new Triangle(10,11,10);	
		assertNotNull(t);
		assertFalse(t.isEquilateral());
	}
	// test 10,10,9 isNotWqualateral max + min -
	@Test
	void testTrianglePlusCisEquilateral() {
		Triangle t=new Triangle(10,10,11);	
		assertNotNull(t);
		assertFalse(t.isEquilateral());
	}
	// robust testing for isIsoceles  nom min -
	@Test
	void testTriangleNomisIsosceles() {
		Triangle t=new Triangle(5,5,8);	
		assertNotNull(t);
		assertTrue(t.isIsosceles());
	}
	// max - robust
	@Test
	void testTriangleMinusAisIsosceles() {
		Triangle t=new Triangle(4,5,8);	
		assertNotNull(t);
		assertFalse(t.isIsosceles());
	}
	///robust testing and testing lines 141-
	// test 10,9,10 isNotWqualateral max -
	@Test
	void testTriangleMinusBisIsosceles() {
		Triangle t=new Triangle(5,4,8);	
		assertNotNull(t);
		assertFalse(t.isIsosceles());
	}
	// test 10,10,9 isNotWqualateral max-
	@Test
	void testTriangleMinusCisIsosceles() {
		Triangle t=new Triangle(5,5,7);	
		assertNotNull(t);
		assertTrue(t.isIsosceles());
	}
	//test 9,10,10 isNotEqulateral max +
	@Test
	void testTrianglePlusAisIsosceles() {
		Triangle t=new Triangle(6,5,8);	
		assertNotNull(t);
		assertFalse(t.isIsosceles());
	}
	// test 10,9,10 isNotWqualateral max + min -
	@Test
	void testTrianglePlusBisIsosceles() {
		Triangle t=new Triangle(5,6,8);	
		assertNotNull(t);
		assertFalse(t.isIsosceles());
	}
	// test 10,10,9 isNotWqualateral max + min -
	@Test
	void testTrianglePlusCisIsosceles() {
		Triangle t=new Triangle(5,5,9);	
		assertNotNull(t);
		assertTrue(t.isIsosceles());
	}


	// robust testing of isScalene 

// nominal test
	@Test
	void testTriangleNomisScalene() {
		Triangle t=new Triangle(29,36,44);	
		assertNotNull(t);
		assertTrue(t.isScalene());
	}
	// max - robust
	@Test
	void testTriangleMinusAisScalene() {
		Triangle t=new Triangle(28,36,44);	
		assertNotNull(t);
		assertTrue(t.isScalene());
	}
	///robust testing max -
	
	@Test
	void testTriangleMinusBisScalene() {
		Triangle t=new Triangle(29,35,44);	
		assertNotNull(t);
		assertTrue(t.isScalene());
	}
	// test 10,10,9 isNotWqualateral max-
	@Test
	void testTriangleMinusCisScalene() {
		Triangle t=new Triangle(29,35,43);	
		assertNotNull(t);
		assertTrue(t.isScalene());
	}
	//test 9,10,10 isNotEqulateral max +, min -
	@Test
	void testTrianglePlusAisScalene() {
		Triangle t=new Triangle(30,36,44);	
		assertNotNull(t);
		assertTrue(t.isScalene());
	}
	// test 10,9,10 isNotWqualateral max + min -
	@Test
	void testTrianglePlusBisScalene() {
		Triangle t=new Triangle(29,37,44);	
		assertNotNull(t);
		assertTrue(t.isScalene());
	}
	// test 10,10,9 isNotWqualateral max + min -
	@Test
	void testTrianglePlusCisScalene() {
		Triangle t=new Triangle(29,36,45);	
		assertNotNull(t);
		assertTrue(t.isScalene());
	}

}
