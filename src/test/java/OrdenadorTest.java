import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class OrdenadorTest {
	Ordenador _or;
	
	@BeforeEach
	void init() {
		_or = new Ordenador();
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0 , 16, 500})
	void emptyArrayTest(int arrSize) {
		int[] array = new int[arrSize];
		
		assertThrows(IllegalArgumentException.class, () -> {
			_or.ordenAscendente( array );
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			_or.ordenDescendente( array );
		});
		
	}
	
	@Test
	void nullArrayTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			_or.ordenAscendente( null );
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			_or.ordenDescendente( null );
		});
		
	}
	
	@Test
	void negativeValuesTest() {
		int[] negativeNums1 = {5,-1,780000000,0};
		int[] negativeNums2 = {7,-2,-30,10000,6700,-50000};
		
		assertThrows(IllegalArgumentException.class, () -> {
			_or.ordenAscendente( negativeNums1 );
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			_or.ordenAscendente( negativeNums2 );
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			_or.ordenDescendente( negativeNums1 );
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			_or.ordenDescendente( negativeNums2 );
		});
	}
	
	
	@Test
	void ascendenteTest() {
		int[] sorted = {1,2,24,33,50,51,67,150000,800000000};
		int[] unSorted = {800000000,33,1,67,24,50,2,150000,51};
		
		assertTrue( Arrays.equals( sorted, _or.ordenAscendente(unSorted) ) );
	}
	
	@Test
	void descendenteTest() {
		int[] sorted = {800000000,150000,67,51,50,33,24,2,1};
		int[] unSorted = {800000000,33,1,67,24,50,2,150000,51};
		
		assertTrue( Arrays.equals( sorted, _or.ordenDescendente(unSorted) ) );
	}
	
}
