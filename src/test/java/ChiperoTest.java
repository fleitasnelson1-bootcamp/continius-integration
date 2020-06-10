import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ChiperoTest {
	private Chipero _ch;
	
	@BeforeEach
	void initChipero() {
		_ch = new Chipero();
	}
	
	@ParameterizedTest
	@ValueSource(ints = {50, 30})
	void puedeVenderTest(int cantidad) {
		if( _ch.disponibles() >= cantidad  ) {
			assertTrue( _ch.puedeVender(cantidad) );
		}
		else {
			assertTrue( !_ch.puedeVender(cantidad) );
		}
	}
	
	@ParameterizedTest
	@ValueSource(ints = {-15, 0, -1})
	void pudeVenderNegativoYCeroTest(int cantidad) {
		assertTrue( !_ch.puedeVender(cantidad) );
	}
	

}
