package test.math.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mu;
	@BeforeEach
    void init() {
    	mu = new MathUtils();
    }
	@Test
	@DisplayName("Testing Add Method")
	void testadd() {
		int expected = 3;
		int actual = mu.add(2, 1);
		assertEquals(expected, actual);
	}
   @Test
   void testComputrCircleArea() {
	   assertEquals(314.16, mu.ComputeCircleArea(10),"should return circle area");
   }
   @Test
   @DisplayName("testing Multiply method")
   void testMultiply() {
	   assertAll(
			   ()-> assertEquals(4, mu.Multiply(2, 2)),
			   ()-> assertEquals(0, mu.Multiply(2, 0)),
			   ()-> assertEquals(-2, mu.Multiply(2, -1))
			   );
   }
   @Test
   @Disabled
   void testDisable() {
	   fail("test fail");
   }
}
