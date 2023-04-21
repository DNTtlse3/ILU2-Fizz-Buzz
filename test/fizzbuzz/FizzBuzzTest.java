package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fb;
	
	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	void premier_test() {
		assertEquals("1",fb.fizzbBuzz(1));
	}
	
	@Test
	void test_fb2() {
		assertEquals("2", fb.fizzbBuzz(2));
	}
	
	@Test 
	void test_fb3() {
		assertEquals("fizz", fb.fizzbBuzz(3));
	}
	
	@Test
	void test_nombres() {
		assertEquals("4", fb.fizzbBuzz(4));
		assertEquals("13", fb.fizzbBuzz(13));
		assertEquals("400", fb.fizzbBuzz(400));
	}
	
	@Test
	void test_fb5() {
		assertEquals("buzz", fb.fizzbBuzz(5));
	}
}
