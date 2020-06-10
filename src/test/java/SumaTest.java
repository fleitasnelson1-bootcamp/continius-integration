import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	void test() {
		Suma s = new Suma();
		assertEquals(5, s.sumar(3, 2));
	}

}
