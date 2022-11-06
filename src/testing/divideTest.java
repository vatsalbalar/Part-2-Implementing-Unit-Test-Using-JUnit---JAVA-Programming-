package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		assertEquals(2, test.divide(4, 2), 0);
		
	}

	@Test
	public void divideException() {
		JunitTesting test = new JunitTesting();
	    test.divide(2, 0);
	}
}


